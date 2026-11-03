# 에뮬레이터 실행 — 현재 상태

2026-11-03 기준 0.3.0을 Android 12/API31 Google APIs x86_64 에뮬레이터에서 실행했습니다. 초기 부팅 문제는 해결되었습니다. 당시 준비 기록은 [EMULATOR_SETUP_HISTORY](EMULATOR_SETUP_HISTORY.md), 최초 0.1.0 실행은 [EMULATOR_FIRST_RUN](EMULATOR_FIRST_RUN.md), 최신 검증은 [MIND_ISLAND](MIND_ISLAND.md)에 있습니다.

## 확인 환경

| 항목 | 값 |
| --- | --- |
| AVD | DizSW01_API31, Pixel 5 기반 |
| 화면 | 1080×2340 |
| 시스템 | Android 12 / API31 Google APIs x86_64 |
| 실제 ABI | x86_64, arm64-v8a |
| 도구 | Emulator 37.2.13, Platform-Tools 37.0.1, JBR25 |
| 패키지 | com.diz.sw01.custom.ui / 0.3.0 |
| 확인 | 0.2.0 위 업데이트, 실행·저장·복원·게임 동작 |

모든 x86_64 이미지가 ARM64 전용 APK를 실행하는 것은 아닙니다.

## 실행 순서

[공식 Android Studio](https://developer.android.com/studio)의 SDK Manager에서 도구와 Google APIs 시스템 이미지를 준비하고 Device Manager에서 API31 이상 AVD를 생성합니다. [BUILD](BUILD.md)로 APK를 먼저 만드세요.

```powershell
$env:ANDROID_HOME = 'C:\Android\Sdk'
$env:PATH = "$env:ANDROID_HOME\platform-tools;$env:PATH"
adb devices -l
$serial = 'emulator-5554' # 본인 devices 출력으로 변경
adb -s $serial shell getprop ro.product.cpu.abilist
adb -s $serial install -r .\dist\Diz_SW01_Mind_Island_0.3.0_ARM64_TEST.apk
adb -s $serial shell am start -W -n com.diz.sw01.custom.ui/com.sma.smartv3.ui.launcher.LauncherActivity
```

첫 실행의 약관·권한·계정 화면은 사용자가 확인합니다. 건강 홈의 마음섬 카드를 누르면 게임이 열립니다. 게임 Activity는 exported=false이므로 일반 adb로 직접 여는 공개 진입점이 아닙니다. 기본 사용·화면 촬영에 root가 필요하지 않습니다.

다른 키의 같은 패키지는 업데이트에 실패할 수 있습니다. 제거하면 앱 데이터가 지워지므로 먼저 키와 패키지를 확인하세요.

## 오프라인 시연 조건

원 제조사 서버가 원 앱 업데이트를 요구하는 문제가 있어 현재 미리보기는 게스트 네트워크가 꺼진 상태입니다. 마음섬 자체는 오프라인 모듈입니다.

```powershell
adb -s $serial shell svc wifi disable
adb -s $serial shell svc data disable
# 시연 종료 후 복원
adb -s $serial shell svc wifi enable
adb -s $serial shell svc data enable
```

이 명령은 가상 Android 네트워크만 바꿉니다. 계정·지도·제조사 동기화 등 인터넷 기능은 오프라인에서 사용할 수 없습니다.

## 워치 연결

이 가상 기기에서 실물 Diz-SW01 Bluetooth 연결은 검증하지 않았습니다. 가상 Bluetooth·호스트 장치 전달·SDK 지원 조건이 맞아야 하며 화면 실행만으로 연결 가능 여부를 판단할 수 없습니다. 마음섬은 워치 없이 자가 기록으로 사용할 수 있습니다. 실제 검색·인증·연결·동기화는 실기기와 워치로 별도 검증합니다.

## 화면 촬영

[Capture-Screen.py](../scripts/Capture-Screen.py)는 원본 PNG를 저장합니다. 공개 전 계정·알림·실제 건강 정보 노출을 확인하세요. 예시 데이터로 촬영한 27장 목록은 [SCREENS](SCREENS.md)에 있습니다.
