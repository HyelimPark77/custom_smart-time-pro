param([string]$SdkRoot, [string]$Serial)
$ErrorActionPreference = 'Stop'
if (-not $SdkRoot) { $SdkRoot = $env:ANDROID_HOME }
if (-not $SdkRoot) { $SdkRoot = $env:ANDROID_SDK_ROOT }
if (-not $SdkRoot) { $SdkRoot = Join-Path $env:LOCALAPPDATA 'Android/Sdk' }
Write-Host "SDK: $SdkRoot"
$adb = Join-Path $SdkRoot 'platform-tools/adb.exe'
$emulator = Join-Path $SdkRoot 'emulator/emulator.exe'
$java = Get-Command java -ErrorAction SilentlyContinue
$studioJava = Join-Path ${env:ProgramFiles} 'Android/Android Studio/jbr/bin/java.exe'
if ($java) { Write-Host "Java: $($java.Source)" }
elseif (Test-Path -LiteralPath $studioJava) { Write-Host "Android Studio Java: $studioJava (set JAVA_HOME for APK builds)" }
else { Write-Host 'MISSING: Java 11+ or Android Studio bundled JBR' }
if (-not (Test-Path -LiteralPath $adb)) {
    Write-Host 'MISSING: SDK Platform-Tools. Install using Android Studio SDK Manager.'
    exit 1
}
if (-not (Test-Path -LiteralPath $emulator)) {
    Write-Host 'MISSING: Android Emulator. Install using Android Studio SDK Manager.'
    exit 1
}
& $emulator -list-avds
if ($LASTEXITCODE -ne 0) { throw 'Cannot list virtual devices.' }
& $adb devices -l
if ($LASTEXITCODE -ne 0) { throw 'Cannot query adb devices.' }
if (-not $Serial) {
    $devices = @(& $adb devices | Where-Object { $_ -match '^emulator-\d+\s+device\s*$' } | ForEach-Object { ($_ -split '\s+')[0] })
    if ($devices.Count -ne 1) { Write-Host 'Start one emulator, or pass -Serial emulator-5554.'; exit 1 }
    $Serial = $devices[0]
}
if ($Serial -notmatch '^emulator-\d+$') { throw 'Only emulator serials are accepted by this check.' }
foreach ($property in @('ro.build.version.sdk','ro.product.cpu.abilist','ro.dalvik.vm.native.bridge','sys.boot_completed')) {
    $value = & $adb -s $Serial shell getprop $property
    if ($LASTEXITCODE -ne 0) { throw "Cannot read $property" }
    Write-Host "${property}: $value"
}
Write-Host 'ARM64 APK requires arm64-v8a support. Native translation and watch connectivity still require runtime verification.'
