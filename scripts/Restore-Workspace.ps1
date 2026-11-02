$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath (Split-Path -Parent $PSScriptRoot)
if (Test-Path -LiteralPath 'workspace/SMART_TIME_PRO_customization') { throw 'Workspace already exists; keep it and continue with Build.ps1.' }
New-Item -ItemType Directory -Force -Path '.downloads','workspace' | Out-Null
& gh release download 'analysis-v2.1.3.4-baseline' '--repo' 'dlwlsrnjs/custom_smart-time-pro' '--pattern' 'customization-workspace.zip' '--dir' '.downloads' '--clobber'
if ($LASTEXITCODE -ne 0) { throw 'Workspace download failed.' }
& python '-m' 'zipfile' '-e' '.downloads/customization-workspace.zip' 'workspace'
if ($LASTEXITCODE -ne 0) { throw 'Workspace extraction failed.' }
Write-Host 'Workspace restored. Edit patches/base, then run scripts/Build.ps1.'
