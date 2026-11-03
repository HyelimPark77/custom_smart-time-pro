# 에뮬레이터로 시작하기

개발 방향: 기존 APK의 화면·기능을 Smali와 리소스로 수정한다. 스마트폰 역할은 Android Emulator로 대체한다. 이 문서는 준비 절차이며 APK 실행 성공 기록이 아니다.

## 현재 환경 (2026-11-02)

- 저장소를 로컬에 복제했다. Windows 긴 경로 지원은 이 저장소의 Git 설정으로 켠다.
- 작업 폴더의 `../android-tools`에 Android Studio 2026.2.2.8, bundled JBR 25, SDK 명령행 도구, Emulator 37.2.13, Platform-Tools 37.0.1을 준비했다. 전역 PATH나 시스템 설치를 변경하지 않았다.
- 전체 Release 작업 공간을 다운로드하고 배포 SHA-256과 비교한 뒤 복원했다. APK 재빌드는 아직 수행하지 않았다.
- Android 12/API 31 Google APIs x86_64 이미지와 Pixel 5 기반 `DizSW01_API31` AVD를 생성했다. 이미지 build.prop에는 x86_64,arm64-v8a가 표시된다. 실제 ARM64 APK 동작은 미검증이다.
- 커스텀 APK의 SHA-256은 저장소 검증 기록 및 Release 체크섬과 일치했다: `94331dac82401815115650592e012fe99fa2e59f43d4e860afa2a7b94a868b93`.
- Codex 실행 환경에서는 `C:\Users\hyoh7\.android` 생성이 거부됐다. 해당 경로 쓰기 권한 승인 후에도 같았다. 에뮬레이터의 기본 설정 파일 생성이 막혀 부팅·앱 설치·실행은 확인하지 못했다. 가상화 점검도 코드 6을 반환했으므로 일반 Windows 환경에서 재확인이 필요하다.
- 이 채팅의 outputs/START-ANDROID.cmd는 일반 Windows에서 가상 기기를 실행하고 부팅·ABI 확인 후 기존 테스트 APK를 설치·시작하도록 준비했다. 부팅 실패 시 로그를 남기며 보안 설정이나 Windows 기능을 자동 변경하지 않는다. 이 실행 파일은 구문만 확인했으며 일반 Windows에서 끝까지 실행한 기록은 아직 없다.
- 기존 APK는 ARM64 전용이다. x86_64 가상 기기는 ARM64 변환 지원을 확인해야 한다.

## 1. Android 개발 도구 준비

[공식 Android Studio](https://developer.android.com/studio)를 설치하고 초기 설정에서 SDK를 설치한다. SDK Manager에서 Android SDK Platform-Tools, Android Emulator와 Google APIs가 포함된 시스템 이미지를 준비한다. 첫 비교 환경은 Android 12 이상(API 31+)으로 설정한다. 이미지마다 ARM64 지원 여부가 다를 수 있으므로 실제 ABI를 확인한다.

Device Manager에서 전화기 AVD를 만들고 실행한다. 원본 Java 복원 디렉터리는 Android Studio에서 바로 빌드하는 소스 프로젝트가 아니다.

저장소 루트의 PowerShell에서:

```powershell
.\scripts\Check-Emulator.ps1
# SDK 위치가 다르면
.\scripts\Check-Emulator.ps1 -SdkRoot 'D:\Android\Sdk'
```

`ro.product.cpu.abilist`에 `arm64-v8a`가 있는지 확인한다. 변환 라이브러리가 표시되어도 모든 네이티브 코드의 실행을 보장하지 않는다. ABI 불일치가 있으면 설치 옵션으로 강제하지 않고 시스템 이미지를 변경한다.

## 2. 빌드 작업 공간 준비

[BUILD.md](BUILD.md)를 따른다. Java 11 이상과 GitHub CLI가 필요하다. Android Studio의 JBR을 사용할 때는 현재 PowerShell 세션에 JAVA_HOME과 PATH를 설정한다.

```powershell
$env:JAVA_HOME = 'C:\Program Files\Android\Android Studio\jbr'
$env:PATH = "$env:JAVA_HOME\bin;$env:PATH"
.\scripts\Restore-Workspace.ps1
.\scripts\Build.ps1
```

복원 스크립트는 현재 `dlwlsrnjs/custom_smart-time-pro`의 기존 Release를 참조한다. 사용자가 지정한 저장소와 소유자가 다르므로 다운로드 가능 여부와 제공된 SHA-256을 확인한다.

## 3. 격리된 가상 기기에서 실행 확인

저장소의 [보안 차단 조사](SECURITY_BLOCK.md)와 [설치 점검](INSTALLATION_AUDIT.md)을 먼저 읽는다. 최초 분석은 개인 Google 계정·연락처·실제 건강 데이터가 없는 테스트 AVD에서 수행한다. 기존 차단의 원인은 미확정이며, 에뮬레이터 실행 결과가 APK 안전성 판정이나 실기기 연결 검증을 대신하지 않는다.

ARM64 지원을 확인하고 APK가 준비되면, 에뮬레이터 일련번호를 지정해 설치한다:

```powershell
$adb = "$env:LOCALAPPDATA\Android\Sdk\platform-tools\adb.exe"
& $adb devices -l
& $adb -s emulator-5554 install '.\dist\Diz_SW01_Custom_0.1.0_ARM64_TEST.apk'
& $adb -s emulator-5554 shell monkey -p com.diz.sw01.custom -c android.intent.category.LAUNCHER 1
& $adb -s emulator-5554 logcat -d -v threadtime > '.\emulator-logcat.txt'
```

실제 SDK 경로와 일련번호로 바꾼다. 설치 오류, 시작 직후 크래시, 권한 요청, 첫 화면을 기록한다. 기존 버전 제거 또는 앱 데이터 초기화는 자동으로 하지 않는다.

## 4. 수정 순서

1. 변경 없는 APK의 설치와 첫 화면을 확인한다.
2. `patches/base/res/values-ko/strings.xml`의 한국어 문구 또는 색상 한 항목을 수정한다.
3. 재빌드·설치 후 변경과 크래시 여부를 확인한다.
4. 홈 화면과 기기 설정을 수정한다. 워치 미연결 상태는 실제 연결 성공 상태와 구분한다.
5. 실제 워치 연동 또는 가짜 워치 데이터가 필요하면 별도 범위로 구현·검증한다. 현재 저장소에는 새 모의 연동을 추가하지 않았다.

## Bluetooth의 범위

[공식 네트워크 문서](https://developer.android.com/studio/run/emulator-networking)는 API 31+에서 Bluetooth Classic/BLE 프로필을 명시한다. 이는 Windows의 Bluetooth 어댑터를 통해 실제 Diz-SW01을 바로 검색·연결할 수 있다는 보장이 아니다. 가상 Bluetooth 환경과 실제 워치 연결은 별도로 검증한다. 워치 없이 UI 개발은 가능하지만 인증·시간 동기화·센서 데이터·펌웨어 전송의 성공은 주장하지 않는다.

[ARM 변환 안내](https://android-developers.googleblog.com/2020/03/run-arm-apps-on-android-emulator.html), [에뮬레이터 가속 설정](https://developer.android.com/studio/run/emulator-acceleration)을 참고한다.
