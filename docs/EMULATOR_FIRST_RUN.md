# 에뮬레이터 첫 실행 확인 — 2026-11-02

- AVD: DizSW01_API31 (Android 12 / API 31, Google APIs x86_64)
- adb serial: emulator-5580
- 실행 시 ABI: x86_64,arm64-v8a
- APK: Diz_SW01_Custom_0.1.0_ARM64_TEST.apk
- 패키지: com.diz.sw01.custom
- 설치: adb install → Success
- 시작: am start -W → Status: ok, COLD, TotalTime 1052ms
- 화면 확인: Diz SW01 Custom의 최초 개인정보 안내 화면(Agree 버튼)
- 수집 시점 로그에서 FATAL EXCEPTION, Fatal signal, UnsatisfiedLinkError는 발견하지 못함.

개인정보 안내 동의, 로그인, 홈 화면, 실제 워치 연결은 아직 확인하지 않았다. 개인정보 안내 화면에서 사용자 확인을 기다린다. 에뮬레이터 실행은 APK의 안전성 판정이나 실제 워치 연결 검증을 의미하지 않는다.

추가 확인: 사용자 동의 진행 후 MainActivity가 전면에서 실행되는 것을 확인했다. Health 홈 화면에 걸음 수·심박수·수면 카드가 표시되며, Device 탭으로 정상 전환했다. Device에는 Add Device가 표시되어 현재 워치는 연결되지 않은 상태다. 확인 시점 AndroidRuntime 로그에서 FATAL EXCEPTION은 발견하지 못했다. Google 로그인은 수행하지 않았다.
