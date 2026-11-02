param([string[]]$Parts = @('base','arm64','xxhdpi'))
$ErrorActionPreference = 'Stop'
Set-Location -LiteralPath $PSScriptRoot
New-Item -ItemType Directory -Force -Path 'builds','logs','.cache/framework' | Out-Null
foreach ($part in $Parts) {
    if ($part -notin @('base','arm64','xxhdpi')) { throw "Unknown part: $part" }
    & java '-Xmx3g' '-jar' 'tools/apktool.jar' 'b' '-j' '4' '-p' '.cache/framework' '-o' "builds/$part-unsigned.apk" "editable/$part" 2>&1 | Tee-Object -FilePath "logs/rebuild-$part.log"
    if ($LASTEXITCODE -ne 0) { throw "Build failed: $part. See logs/rebuild-$part.log" }
}
Write-Host 'Build complete. APKs are unsigned; sign all three with the same key before installation.'
