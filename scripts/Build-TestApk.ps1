param([string]$IdentityProfile = '')
$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath $PSScriptRoot
$apkFilename = 'SMART_TIME_PRO_2.1.3.4_ARM64_TEST.apk'
if ($IdentityProfile) {
    $IdentityProfile = (Resolve-Path -LiteralPath $IdentityProfile).Path
    $profileData = Get-Content -Raw -LiteralPath $IdentityProfile | ConvertFrom-Json
    $apkFilename = $profileData.apk_filename
    if (($apkFilename -ne (Split-Path -Leaf $apkFilename)) -or ($apkFilename -notmatch '\.apk$')) { throw 'Invalid APK filename in profile.' }
}
if (-not (Test-Path -LiteralPath 'builds/base-unsigned.apk')) {
    throw 'Run Rebuild.ps1 first. This script merges the most recent rebuilt base DEX.'
}
$mergeDir = '.cache/standalone-' + [Guid]::NewGuid().ToString('N')
& python 'PrepareStandalone.py' $mergeDir
if ($LASTEXITCODE -ne 0) { throw 'Standalone preparation failed.' }
if ($IdentityProfile) {
    & python 'ApplyIdentity.py' '--decoded' $mergeDir '--profile' $IdentityProfile '--report' 'inventory/custom_identity_changes.json'
    if ($LASTEXITCODE -ne 0) { throw 'App identity application failed.' }
}
& java '-Xmx4g' '-jar' 'tools/apktool.jar' 'b' '-j' '6' '-p' '.cache/framework' '-o' 'builds/standalone-unsigned.apk' $mergeDir
if ($LASTEXITCODE -ne 0) { throw 'Standalone build failed.' }
if (-not (Test-Path -LiteralPath 'test-only.jks')) {
    & keytool '-genkeypair' '-keystore' 'test-only.jks' '-storepass' 'android' '-keypass' 'android' '-alias' 'androiddebugkey' '-dname' 'CN=SMART TIME Local Test, OU=Development, O=Local Test, C=KR' '-keyalg' 'RSA' '-keysize' '2048' '-validity' '3650'
    if ($LASTEXITCODE -ne 0) { throw 'Test key generation failed.' }
}
New-Item -ItemType Directory -Force -Path 'test-apk' | Out-Null
& './tools/zipalign.exe' '-f' '-p' '4' 'builds/standalone-unsigned.apk' 'builds/standalone-aligned.apk'
if ($LASTEXITCODE -ne 0) { throw 'Alignment failed.' }
& java '-Xmx2g' '-cp' 'tools/uber-apk-signer.jar' 'com.android.apksigner.ApkSignerTool' 'sign' '--ks' 'test-only.jks' '--ks-key-alias' 'androiddebugkey' '--ks-pass' 'pass:android' '--key-pass' 'pass:android' '--out' "test-apk/$apkFilename" 'builds/standalone-aligned.apk'
if ($LASTEXITCODE -ne 0) { throw 'Test signing failed.' }
& java '-cp' 'tools/uber-apk-signer.jar' 'com.android.apksigner.ApkSignerTool' 'verify' '--verbose' "test-apk/$apkFilename"
if ($LASTEXITCODE -ne 0) { throw 'Signature verification failed.' }
& './tools/zipalign.exe' '-c' '-p' '4' "test-apk/$apkFilename"
if ($LASTEXITCODE -ne 0) { throw 'Alignment verification failed.' }
Write-Host 'Test APK created in test-apk. This development key is not for production distribution.'
