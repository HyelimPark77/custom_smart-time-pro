param([switch]$Baseline, [string]$IdentityProfile = '')
$ErrorActionPreference = 'Stop'
$repoRoot = Split-Path -Parent $PSScriptRoot
Set-Location -LiteralPath $repoRoot
if ($Baseline -and $IdentityProfile) { throw 'Choose Baseline or IdentityProfile, not both.' }
if ($IdentityProfile) { $IdentityProfile = (Resolve-Path -LiteralPath $IdentityProfile).Path }
$workspace = if ($env:SMART_TIME_WORKSPACE) { $env:SMART_TIME_WORKSPACE } else { Join-Path $repoRoot 'workspace/SMART_TIME_PRO_customization' }
if (-not (Test-Path -LiteralPath $workspace)) { throw 'Run scripts/Restore-Workspace.ps1 first.' }
if (Test-Path -LiteralPath (Join-Path $repoRoot 'features/mind-island/src')) { & (Join-Path $PSScriptRoot 'Compile-MindIsland.ps1') }
foreach ($name in @('Rebuild.ps1','Sign.ps1','Build-TestApk.ps1','PrepareStandalone.py','ApplyIdentity.py')) {
    Copy-Item -LiteralPath (Join-Path $PSScriptRoot $name) -Destination (Join-Path $workspace $name)
}
& python (Join-Path $PSScriptRoot 'ApplyOverlay.py')
if ($LASTEXITCODE -ne 0) { throw 'Overlay application failed.' }
Push-Location -LiteralPath $workspace
try {
    & './Rebuild.ps1'
    if ($Baseline) {
        $apkFilename = 'SMART_TIME_PRO_2.1.3.4_ARM64_TEST.apk'
        & './Build-TestApk.ps1'
    } else {
        $profilePath = if ($IdentityProfile) { $IdentityProfile } else { Join-Path $repoRoot 'profiles/diz-sw01-teen-ui.json' }
        $apkFilename = (Get-Content -Raw -LiteralPath $profilePath | ConvertFrom-Json).apk_filename
        & './Build-TestApk.ps1' -IdentityProfile $profilePath
    }
} finally { Pop-Location }
New-Item -ItemType Directory -Force -Path 'dist' | Out-Null
Copy-Item -LiteralPath (Join-Path $workspace "test-apk/$apkFilename") -Destination "dist/$apkFilename"
Write-Host "APK ready: dist/$apkFilename"
