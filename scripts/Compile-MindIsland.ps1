param([string]$SdkRoot = $env:ANDROID_HOME)
$ErrorActionPreference = 'Stop'
$repoRoot = Split-Path -Parent $PSScriptRoot
if (-not $SdkRoot) { $SdkRoot = $env:ANDROID_SDK_ROOT }
if (-not $SdkRoot) { $SdkRoot = Join-Path (Split-Path -Parent $repoRoot) 'android-tools/sdk' }
$androidJar = Join-Path $SdkRoot 'platforms/android-35/android.jar'
$d8Jar = Join-Path $SdkRoot 'build-tools/35.0.0/lib/d8.jar'
if (-not (Test-Path -LiteralPath $androidJar) -or -not (Test-Path -LiteralPath $d8Jar)) {
    throw 'Mind Island needs Android SDK platform 35 and build-tools 35.0.0. Set ANDROID_HOME to that SDK.'
}
$workspace = if ($env:SMART_TIME_WORKSPACE) { $env:SMART_TIME_WORKSPACE } else { Join-Path $repoRoot 'workspace/SMART_TIME_PRO_customization' }
if (Test-Path -LiteralPath (Join-Path $workspace 'editable/base/smali_classes20')) { throw 'DEX slot 20 is reserved for Mind Island; another smali_classes20 directory exists.' }
$cache = Join-Path $workspace ('.cache/mind-island-' + [Guid]::NewGuid().ToString('N'))
$classes = Join-Path $cache 'classes'
$dex = Join-Path $cache 'dex'
New-Item -ItemType Directory -Force $classes,$dex | Out-Null
$sources = @(Get-ChildItem -LiteralPath (Join-Path $repoRoot 'features/mind-island/src') -Recurse -Filter '*.java' | ForEach-Object FullName)
& javac -encoding UTF-8 -source 8 -target 8 -classpath $androidJar -d $classes @sources
if ($LASTEXITCODE -ne 0) { throw 'Mind Island Java compilation failed.' }
$jar = Join-Path $cache 'mind-island.jar'
& jar "-J-Djava.io.tmpdir=$cache" cf $jar -C $classes .
if ($LASTEXITCODE -ne 0) { throw 'Mind Island JAR creation failed.' }
& java -cp $d8Jar com.android.tools.r8.D8 --min-api 26 --lib $androidJar --output $dex $jar
if ($LASTEXITCODE -ne 0) { throw 'Mind Island DEX compilation failed.' }
Copy-Item -LiteralPath (Join-Path $dex 'classes.dex') -Destination (Join-Path $repoRoot 'patches/base/classes20.dex')
Write-Host 'Mind Island compiled into classes20.dex.'
