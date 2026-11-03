# 커스터마이징하고 APK로 만드는 방법

> 현재 버전은 앱 전체 테마 0.5.0입니다. 현재 기본 프로필은 diz-sw01-teen-ui.json이며, 아래 명령처럼 명시해서 빌드할 수도 있습니다. 환경 설정은 [README](../README.md#빠른-실행빌드)가 기준입니다.
>
> Windows는 짧은 작업 경로를 권장합니다. Restore-Workspace.ps1의 DestinationRoot로 경로를 지정하고 출력된 폴더를 SMART_TIME_WORKSPACE로 설정하세요. 현재 복원 스크립트는 GitHub CLI 없이 고정 상위 Release를 다운로드하고 SHA-256을 검사합니다. 빌드 시작 시 마음섬 Java를 DEX 20으로 컴파일합니다. 현재 패키지는 com.diz.sw01.custom.ui입니다.

## 1. 전체 작업 공간 복원

Windows, Java 17 이상, Python 3.8 이상, Android SDK platform 35와 build-tools 35.0.0가 필요합니다. JADX를 대규모로 다시 실행할 경우 메모리가 많이 필요하지만 XML·Smali 수정 후 Apktool 재조립은 별도입니다.

```powershell
.\scripts\Restore-Workspace.ps1
```

이 명령은 고정 Release의 `customization-workspace.zip`을 받아 `workspace/SMART_TIME_PRO_customization`에 풉니다. 기존 작업 공간이 있으면 덮어쓰지 않습니다. 압축 안에는 대량의 파일이 있으므로 시간이 걸릴 수 있습니다.

전체 작업 공간에는 수정용 `editable`, 읽기용 `readable`, `linear_reference`, 자동 별칭, 도구, 인덱스가 있습니다. `workspace/`는 Git에서 제외합니다. 원본 APK와 생성한 서명 키는 공개 소스 번들에서 제외했습니다.

## 2. 변경할 기능 찾기

[25개 영역 안내](CUSTOMIZATION.md)에서 기능과 경로를 찾습니다. `reference-java/`와 `linear-reference-java/`로 로직을 읽고 `analysis/code_index.json`에서 원래 클래스의 Smali 위치를 찾으세요.

예를 들어 앱 한국어 문구는 `patches/base/res/values-ko/strings.xml`, 앱 표시 이름은 `patches/base/res/values/strings.xml` 및 locale별 `app_name`, 홈 화면은 `patches/base/res/layout/activity_main.xml`과 `com.sma.smartv3.ui.main`에 해당합니다. `%s`, `%d`, XML 서식과 뷰 ID는 호출 코드와 맞아야 합니다.

실제 수정은 `patches/base/`에서 진행합니다. `reference-java/`를 고친 것만으로는 APK가 바뀌지 않습니다. Java 복원본이 불완전한 메서드는 Smali를 기준으로 확인합니다.

기본 저장소에 없는 타사 SDK 파일을 수정하려면 `workspace/.../editable/base/`의 해당 Smali를 같은 상대 경로로 `patches/base/`에 복사한 뒤 수정하세요. 분할 리소스·네이티브 항목은 `patches/xxhdpi/`, `patches/arm64/`라는 같은 방식의 오버레이를 추가할 수 있습니다.

## 3. 오버레이 적용·빌드·통합·서명

```powershell
.\scripts\Build.ps1 -IdentityProfile .\profiles\diz-sw01-teen-ui.json
```

실행 순서는 다음과 같습니다.

1. 저장소의 빌드 스크립트를 작업 공간에 복사합니다.
2. `patches/`의 변경 파일을 `editable/`의 같은 위치에 반영합니다. 다른 기존 파일은 덮어쓰기 전 작업 공간의 `.cache`에 백업합니다.
3. `Rebuild.ps1`로 세 분할 APK를 재조립합니다.
4. `PrepareStandalone.py`로 기본 리소스·분할 리소스·ARM64 라이브러리를 합칩니다. 최신 재조립 DEX를 사용합니다. 기본 빌드에서는 이후 `ApplyIdentity.py`로 커스텀 프로필의 이름·앱 ID·Provider·자체 권한·버전을 적용합니다.
5. 통합 APK를 만들고 4바이트 ZIP 정렬을 적용합니다. 현재 APK는 `extractNativeLibs=true`입니다.
6. 로컬 테스트 키로 서명하고 서명·정렬을 검증합니다.
7. 결과를 `dist/Diz_SW01_Teen_UI_0.5.0_ARM64_TEST.apk`에 복사합니다. `scripts/Build.ps1 -Baseline`은 앱 ID를 유지한 이전 기준 빌드를 생성합니다.

입력 예외가 나면 해당 단계에서 중단합니다. `workspace/.../logs`에서 단계별 결과를 확인하세요. 현재 PC의 복원 작업 공간에서 0.3.0 빌드·서명·설치·런타임 검증을 수행했습니다. 별도 팀원 PC의 깨끗한 환경까지 재현한 것은 아닙니다.

## 4. 서명 키

처음 빌드할 때 작업 공간에 개발용 `test-only.jks`를 생성합니다. 공개 저장소·Release 번들에는 비공개 키를 포함하지 않습니다. 로컬에서 생성한 키는 후속 테스트 APK 업데이트를 위해 보관하세요. 다른 키로 서명하면 이전 테스트 APK를 덮어 업데이트할 수 없습니다.

테스트 키의 별칭은 `androiddebugkey`, 저장소/키 암호는 `android`입니다. 상용 배포용 키가 아닙니다. 정식 배포는 별도의 안전한 배포 키와 서비스별 앱 등록·라이선스 확인이 필요합니다.

## 5. 패키지명을 바꾸려면

이전 기준 빌드는 `com.sma.smartv3.pro`를 유지하며, 새 커스텀 프로필은 `com.diz.sw01.custom`을 사용합니다. [별도 앱 식별자 변경 기록](CUSTOM_APP_IDENTITY.md)을 확인하세요. 병행 설치를 위해 provider authorities, signature permission 이름과 패키지에 종속되는 intent 식별자를 함께 변경했습니다. 리플렉션·문자열 참조, 외부 로그인 리디렉션, 지도·광고 SDK 설정, 서비스 등록 및 서버 바인딩은 추가 런타임 검토가 필요합니다.

Diz-SW01 연결이 새 서명에서 유지되는지 먼저 확인한 후 패키지명 변경을 별도 변경으로 진행하세요. 각 변경은 UI 변경과 분리해서 커밋하면 실패 원인을 찾기 쉽습니다.

## 6. 원본 수준의 재컴파일 가능한 프로젝트가 필요한 경우

JADX Gradle export만으로 정상 빌드를 보장할 수 없습니다. 자체 Android 프로젝트에서 UI·데이터 계층을 새로 구현하고, 사용 허가된 제조사 SDK나 검증한 통신 규격으로 연결하는 별도 개발 작업이 필요합니다. 이 저장소의 첫 단계는 기존 동작을 보존한 Smali·리소스 수정입니다.
