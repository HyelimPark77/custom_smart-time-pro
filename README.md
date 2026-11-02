# custom_smart-time-pro

SMART-TIME PRO **2.1.3.4** (`com.sma.smartv3.pro`, versionCode 8413)의 정적 복원 자료와 커스터마이징 작업 공간입니다. 대상 워치는 **Diz-SW01**이며, 사용자가 **기존 공식 앱과 연결됨**을 확인했습니다.

> **2026-11-02 설치 차단 보고:** 기준 테스트 APK 설치 시 기기에서 ‘악성 앱으로 의심’ 및 해제할 수 없는 차단 경고가 표시됐습니다. 원인은 아직 확정하지 않았습니다. 서명·정렬 검증은 악성코드 안전성 검사가 아니며, 현재 APK의 설치를 보류하고 [보안 차단 조사 기록](docs/SECURITY_BLOCK.md)을 확인하세요.

**수정·재서명한 APK의 실제 실행과 Diz-SW01 연결은 아직 검증하지 않았습니다.** 이 저장소의 기준 APK는 기존 앱의 화면·통신 동작을 보존하고 분할 APK를 ARM64 단일 APK로 합친 테스트 빌드입니다. 새로운 디자인이나 기능을 이미 적용한 버전이 아닙니다.

## 다운로드

[기준 테스트 빌드와 전체 복원 작업 공간 받기](https://github.com/dlwlsrnjs/custom_smart-time-pro/releases/tag/analysis-v2.1.3.4-baseline)

- `SMART_TIME_PRO_2.1.3.4_ARM64_TEST.apk`: 휴대폰 설치 테스트용 단일 APK. ARM64 Android 8.0 이상 대상.
- `customization-workspace.zip`: 전체 Smali·Java 복원본·XML·이미지·assets·네이티브 라이브러리·도구·인덱스를 포함한 작업 공간.
- `SHA256SUMS.txt`: 다운로드 파일의 SHA-256.

기존 앱과 **패키지명은 같고 서명은 다릅니다.** 기존 앱 위에 업데이트 설치되지 않을 수 있습니다. 기존 앱 삭제 시 로컬 데이터가 사라질 수 있으므로 가능하면 별도 테스트용 휴대폰에서 먼저 확인하세요. [설치·테스트 안내](docs/TESTING.md)를 먼저 읽으세요.

## 먼저 읽을 문서

1. [복원된 것과 복원되지 않은 것](docs/RECOVERY.md)
2. [25개 영역별 수정 가능 범위와 코드 위치](docs/CUSTOMIZATION.md)
3. [작업 공간 복원 → 코드 수정 → APK 빌드](docs/BUILD.md)
4. [Diz-SW01 연결 보존 및 실기기 검증](docs/TESTING.md)
5. [후속 작업자용 진행 상황과 다음 작업](docs/HANDOFF.md)

## 저장소 구성

| 경로 | 용도 |
| --- | --- |
| `patches/base/` | 실제 수정할 앱·연결 SDK Smali와 XML·이미지·assets. 전체 작업 공간에 같은 상대 경로로 덮어 적용하는 오버레이 |
| `reference-java/` | 앱과 연결 SDK의 구조 복원 Java. 코드를 이해하기 위한 자료 |
| `linear-reference-java/` | 앱과 연결 SDK의 단순 명령 흐름 보조 복원본 |
| `analysis/` | 전체 클래스·수정 위치·리소스·네이티브 심볼·검증 결과·복원 결함 인덱스 |
| `scripts/` | 작업 공간 복원, 오버레이 적용, 재조립, 통합 APK 생성·서명 스크립트 |
| `docs/` | 변경 가능 범위, 제약, 빌드, 테스트, 인수인계 |

대량의 제3자 라이브러리까지 포함한 **전체 복원 코드**는 Release 작업 공간에 있습니다. 저장소에는 일상적으로 수정할 앱·연결 SDK와 리소스를 직접 열람할 수 있게 정리했습니다. `patches/`만 단독으로 빌드할 수 있는 구성은 아니며, Release 작업 공간을 먼저 복원해야 합니다. 다른 SDK의 코드까지 수정하려면 전체 작업 공간에서 해당 파일을 `patches/`의 같은 경로로 추가합니다.

## 빠른 시작 — Windows PowerShell

Java 11 이상, Python 3.6 이상, GitHub CLI(`gh`)가 필요합니다. 도구 바이너리는 Release 작업 공간에 포함돼 있습니다.

```powershell
git clone https://github.com/dlwlsrnjs/custom_smart-time-pro.git
cd custom_smart-time-pro
.\scripts\Restore-Workspace.ps1
# patches/base 아래 XML·이미지·Smali를 수정
.\scripts\Build.ps1
```

결과는 `dist/SMART_TIME_PRO_2.1.3.4_ARM64_TEST.apk`입니다. 새 환경에서는 로컬 테스트 키가 생성됩니다. 이 키와 원래 Release APK의 테스트 키는 다르므로 서로 업데이트 설치가 안 될 수 있습니다. 생성한 키는 Git에 올리지 않습니다.

`reference-java`를 Android Studio에 가져와 바로 빌드하는 프로젝트가 아닙니다. 실제 수정·재조립 경로는 Smali와 리소스입니다.

## 확인한 결과

- 원본 분할 APK 3개 모두 디코딩·재조립 성공.
- DEX 21개(기본 DEX 19개 + assets 내 DEX 2개)의 클래스 구성이 원본과 일치: **114,310개 정의**.
- ARM64 라이브러리 **50개** 바이트 일치.
- 단일 APK에 원본 리소스 ID **30,432개** 모두 보존.
- 단일 APK 서명 **v2·v3 검증 통과**, ZIP 정렬 검증 통과.
- 휴대폰 실행, 워치 검색·인증·동기화, 서버 로그인은 **미검증**.

근거: [분할 APK 재조립 검증](analysis/build_verification.json), [단일 APK 검증](analysis/standalone_verification.json).

## 복원과 배포의 한계

원 제작자의 R8/ProGuard 매핑 파일은 없습니다. 사라진 이름·주석·프로젝트·서버 소스를 완전히 복구한 상태가 아니며, 자동 별칭은 원래 이름이 아닙니다. 구조 복원 과정에서 도구가 456건의 오류를 보고했고 앱·연결 SDK 보조 복원본은 13건을 보고했습니다. 오류와 경고 표식이 없는 Java 코드도 정확성을 보장하지 않습니다. 전체 Smali를 최종 확인 자료로 사용하세요.

제조사 서버·콘텐츠·결제 권한·SDK 등록·서명 인증은 별도입니다. 앱 수정으로 펌웨어가 지원하지 않는 센서·기능이 생기지는 않습니다. 이 저장소는 원 앱의 저작권이나 타사 SDK·이미지의 재배포 권한을 부여하지 않습니다. 각 권리자의 조건을 별도로 확인해야 합니다. 원 앱 전체에 새로운 오픈소스 라이선스를 부여하지 않았습니다.
