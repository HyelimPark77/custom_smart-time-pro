# 현재 인수인계 — 마음섬 0.3.0

기준: 2026-11-03. 초기 복원 기록은 [HANDOFF_BASELINE](HANDOFF_BASELINE.md)에 보관했습니다. 최신 화면과 실행 절차는 [README](../README.md)가 기준입니다.

## 완료 상태

- 한국어 기본 문구와 청록색 카드·아이콘 UI 반영.
- 건강 홈에서 Java Activity와 로컬 WebView 기반 마음섬 진입.
- 날씨·메모·7일 기록, 섬 3배경·6꾸미기·3자리, 자가 기록 퀘스트, 60초 호흡, 주관적 쉼, 선택 삭제 구현.
- no-backup AtomicFile 저장, 외부 WebView 요청 차단. 원 앱 네트워크 기능은 별도 유지.
- 같은 키로 0.2.0 위 0.3.0 업데이트 설치. API31에서 저장·복원·보상·꾸미기·타이머·삭제 검증.
- 모델 테스트 15개, Java→DEX20, APK 조립·서명·정렬 검사 통과. 기존 네이티브 50개 바이트 유지.
- 실제 화면 27장과 명세 작성. 예시 데이터만 사용하고 촬영 후 기존 마음섬 상태 복원.
- 긴 경로 대응 복원·SHA-256 확인·원본 화면 캡처 도구 추가.

## 버전과 산출물

| 항목 | 값 |
| --- | --- |
| 패키지 | `com.diz.sw01.custom.ui` |
| versionName / Code | `0.3.0` / `3` |
| 프로필 | `profiles/diz-sw01-mind-island.json` |
| APK | `Diz_SW01_Mind_Island_0.3.0_ARM64_TEST.apk` |
| 검증 APK SHA-256 | `9badedf9f32c0a753a1e97d66ee04c41b50f88aaa2f6c1b9f95b847c5c508d07` |
| 기록 | [검증 JSON](../analysis/mind-island-verification.json) |

APK·키·전체 복원 작업 공간은 소스 커밋에서 제외합니다. 재빌드하면 키·ZIP 메타데이터 등에 따라 APK 해시가 달라질 수 있습니다.

## 다음 담당자의 시작

[BUILD](BUILD.md)로 고정 baseline 작업 공간을 복원하고 SMART_TIME_WORKSPACE를 지정합니다. `Build.ps1 -IdentityProfile ./profiles/diz-sw01-mind-island.json`으로 빌드합니다. 복원 Java를 Android Studio에서 Gradle로 바로 빌드하는 구조가 아닙니다. 담당별 수정 위치는 [TEAM_GUIDE](TEAM_GUIDE.md)에 있습니다.

## 남은 작업

1. 원 제조사 온라인 강제 업데이트 정책을 커스텀 앱에서 분리하고 온라인 실행 검증. 현재 시연은 게스트 네트워크가 꺼져 있습니다.
2. 기존 Galaxy S25 설치 차단 원인·권한·네이티브 호환성 검토. 에뮬레이터 성공은 안전성 판정이 아닙니다.
3. 실물 Diz-SW01 검색·인증·연결·동기화와 새 서명·앱 ID의 서버·SDK 동작 검증.
4. 워치 데이터를 연결할 때 자동 측정·자가 기록·미연결 상태 구분.
5. 청소년 사용성·접근성·개인정보 설명과 다양한 Android/WebView 환경 검증.

제조사 로그인, 실제 워치 연결, 임상 효과, 스토어 배포 권리 확보는 완료되지 않았습니다. 과거 차단 근거는 [SECURITY_BLOCK](SECURITY_BLOCK.md), [INSTALLATION_AUDIT](INSTALLATION_AUDIT.md)을 참고하세요.
