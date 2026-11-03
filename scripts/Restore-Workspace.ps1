param([string]$DestinationRoot = 'workspace', [string]$ArchivePath = '')
$ErrorActionPreference = 'Stop'
$ProgressPreference = 'SilentlyContinue'
$repoRoot = Split-Path -Parent $PSScriptRoot
Set-Location -LiteralPath $repoRoot
if (-not [IO.Path]::IsPathRooted($DestinationRoot)) { $DestinationRoot = Join-Path $repoRoot $DestinationRoot }
$DestinationRoot = [IO.Path]::GetFullPath($DestinationRoot)
if (Test-Path -LiteralPath (Join-Path $DestinationRoot 'SMART_TIME_PRO_customization')) { throw 'Workspace already exists; keep it and continue with Build.ps1.' }
if (-not $ArchivePath) {
    $ArchivePath = Join-Path $repoRoot '.downloads/customization-workspace.zip'
    New-Item -ItemType Directory -Force -Path (Split-Path -Parent $ArchivePath) | Out-Null
    if (-not (Test-Path -LiteralPath $ArchivePath)) {
        $url = 'https://github.com/dlwlsrnjs/custom_smart-time-pro/releases/download/analysis-v2.1.3.4-baseline/customization-workspace.zip'
        Invoke-WebRequest -Uri $url -OutFile $ArchivePath
    }
}
$ArchivePath = (Resolve-Path -LiteralPath $ArchivePath).Path
$expected = 'c6cf98d0cfadb9eebde48e19c8cbedd7954abd7c35f98801dc240a9b6448461b'
if ((Get-FileHash -LiteralPath $ArchivePath -Algorithm SHA256).Hash.ToLower() -ne $expected) {
    throw 'Workspace SHA-256 mismatch. Keep the current workspace unchanged and obtain the pinned baseline archive again.'
}
& python (Join-Path $PSScriptRoot 'Extract-Workspace.py') $ArchivePath $DestinationRoot
if ($LASTEXITCODE -ne 0) { throw 'Workspace extraction failed.' }
$restored = Join-Path $DestinationRoot 'SMART_TIME_PRO_customization'
Write-Host "Workspace restored: $restored"
if ($restored -ne (Join-Path $repoRoot 'workspace/SMART_TIME_PRO_customization')) {
    Write-Host "Before building, set SMART_TIME_WORKSPACE to: $restored"
}
