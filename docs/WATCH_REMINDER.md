# 마음섬 쉼 알림 · 수동 전송

수동 통합 APK에서 실제 워치의 메시지 표시·진동을 사용자가 확인했다. Java/DEX 컴파일, 서명, 핵심 파일 70개 보존 검사, 브라우저 음성·쉼 알림 검사 및 기존 모델 검사를 통과했다. 검증 범위와 APK 해시는 `analysis/watch-reminder-0.7.0-dev.1-verification.json`에 기록한다.

마음섬 → 쉬어가기 → ‘워치로 쉼 알림 보내기’를 누르면 시험 메시지 한 건을 요청한다. 화면 진입·호흡 시작·건강 기록 조회로 자동 전송하지 않는다.

`WatchReminder`는 기존 `BleConnector.INSTANCE`의 `isAvailable()`을 확인한 뒤 `BleNotification(127, time, ownPackage, title, content)`을 `BleKey.NOTIFICATION`, `BleKeyFlag.UPDATE`, `false, false`로 전송한다. 원본 `MyNotificationListenerService`와 같은 BLE 전송 API이며, 자신의 패키지 알림을 제외하는 Android 알림 수신 경로를 거치지 않는다. 권한 추가나 알림 수신 설정 변경, 전화용 오디오 요청은 하지 않는다.

`sendObject`의 true는 기존 BLE 메시지 큐가 요청을 받아들였다는 의미다. 도착·표시·진동 완료로 표시하지 않는다. 실제 워치의 표시·진동은 별도 확인해야 하며 방해 금지·워치 설정·연결 끊김에 영향을 받을 수 있다. 전송 요청 성공 후 30초 동안 추가 요청을 막는다. 앱 프로세스 재시작 시 이 제한은 초기화된다.

현재 자동 건강 조건·예약·백그라운드 알림은 구현하지 않았다. 음성 입력 설정은 변경하지 않는다. 브라우저 검사는 버튼 명시 동작·중복 요청 방지·게임 상태 변경 없음·안전한 결과 문자열 표시를 확인한다. Java/DEX 및 APK 정적 검사와 실제 S25/Diz-SW01 시험 결과를 구분해 기록한다.
