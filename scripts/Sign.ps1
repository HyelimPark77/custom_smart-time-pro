param(
    [Parameter(Mandatory=$true)][string]$Zipalign,
    [Parameter(Mandatory=$true)][string]$Apksigner,
    [Parameter(Mandatory=$true)][string]$Keystore,
    [Parameter(Mandatory=$true)][string]$Alias
)
$ErrorActionPreference = 'Stop'
$Zipalign = (Resolve-Path -LiteralPath $Zipalign).Path
$Apksigner = (Resolve-Path -LiteralPath $Apksigner).Path
$Keystore = (Resolve-Path -LiteralPath $Keystore).Path
Set-Location -LiteralPath $PSScriptRoot
New-Item -ItemType Directory -Force -Path 'signed' | Out-Null
foreach ($part in @('base','arm64','xxhdpi')) {
    & $Zipalign '-f' '-P' '16' '4' "builds/$part-unsigned.apk" "signed/$part-aligned.apk"
    if ($LASTEXITCODE -ne 0) { throw "Alignment failed: $part" }
    & $Apksigner 'sign' '--ks' $Keystore '--ks-key-alias' $Alias '--out' "signed/$part.apk" "signed/$part-aligned.apk"
    if ($LASTEXITCODE -ne 0) { throw "Signing failed: $part" }
    & $Apksigner 'verify' '--verbose' "signed/$part.apk"
    if ($LASTEXITCODE -ne 0) { throw "Signature verification failed: $part" }
}
Write-Host 'All three APKs signed and verified. Installation is a separate step.'
