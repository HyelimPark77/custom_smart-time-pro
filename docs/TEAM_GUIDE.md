# 팀 작업 안내

기준: 2026-11-03 / 전체 테마 0.5.0. [README](../README.md), [화면 명세](SCREENS.md), [빌드 절차](BUILD.md)를 먼저 읽으세요.

최신 네이티브 화면과 확인 범위는 [앱 전체 테마](APP_WIDE_THEME.md), 시작·로그인·게임 캐릭터는 [캐릭터 UI](TEEN_UI.md)를 참고하세요.

## 담당별 수정 위치

| 담당 | 실제 수정 파일 | 확인 사항 |
| --- | --- | --- |
| 기획·디자인 | `patches/base/assets/mind-island/index.html`, `style.css` | 상태별 문구·배치·선택권 |
| 게임 화면 | `patches/base/assets/mind-island/app.js` | 이벤트·탭·타이머·저장 실패 안내 |
| 게임 규칙 | `patches/base/assets/mind-island/model.js` | 날짜·중복 보상·구매·삭제 |
| Android | `features/mind-island/src/` | Activity, WebView 제한, AtomicFile 저장 |
| 기존 UI·한국어 | `patches/base/res/` | 리소스 ID·포맷 인자 유지 |
| 기존 연결 | `patches/base/smali*/` | 읽기용 Java로 구조를 읽고 실제 Smali 수정 |
| 빌드·QA | `scripts/`, `profiles/`, `tests/` | 같은 서명 업데이트·ABI·런타임 검증 |

읽기용 reference-java만 수정해도 앱에 반영되지 않습니다. 생성 DEX 대신 새 모듈 Java 원본을 커밋합니다.

## 협업 순서

1. 최신 main에서 기능 브랜치를 만들어 소스와 화면 명세를 함께 수정합니다.
2. 규칙 변경은 `node tests/mind-island-model.test.cjs`로 검증합니다.
3. 마음섬 프로필로 빌드하고 같은 키로 업데이트합니다.
4. 에뮬레이터에서 진입·저장·재실행·보상 중복 방지·삭제 범위를 확인합니다. 타이머 변경은 실제 시간과 백그라운드 전환으로 검사합니다.
5. 예시 데이터로 해당 화면을 다시 촬영하고 README·SCREENS·manifest를 갱신합니다.
6. PR에는 바뀐 사용자 동작, 화면 번호, 실행한 검사와 미검증 범위를 적고 팀 리뷰 후 병합합니다.

## 화면 촬영

```powershell
python .\scripts\Capture-Screen.py --serial emulator-5580 --output .\docs\screenshots\08-island-decorated.png
# adb가 PATH에 없다면 --adb 'C:\Android\Sdk\platform-tools\adb.exe' 지정
```

도구는 원본 PNG를 저장합니다. 공개 전 계정·실제 메모·건강 기록·알림 노출을 확인하세요. 문서의 예시 기록은 신규 설치 시 자동 생성되지 않습니다. 파일을 바꾸면 manifest.json의 해상도·SHA-256·설명도 갱신하세요.

## 공유 범위

소스·오버레이·프로필·문서·예시 화면·검증 요약은 Git으로 공유합니다. APK, 서명 키, 전체 작업 공간, 실제 사용자 상태 JSON과 계정 화면은 커밋하지 않습니다. 키는 별도 안전한 경로로 관리합니다.

현재 0.3.0 소스와 문서를 제공하며 새 APK 다운로드 Release를 발행한 상태는 아닙니다. 과거 상위 저장소의 APK·복원 ZIP은 현재 커스텀 APK와 다른 산출물입니다.

감정 종류별 차등 보상·경쟁 순위·미접속 벌점은 사용하지 않습니다. 주관적 기록을 워치 측정처럼 표시하지 않습니다. 워치 연결·실기기 설치 차단·제조사 업데이트 문제를 완료로 표시하려면 검증 근거를 남기세요. 개인정보 처리 변경은 화면과 기술 문서를 함께 수정합니다. 원 앱·SDK 배포 권리는 별도로 확인해야 합니다.
