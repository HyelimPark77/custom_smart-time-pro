# 별도 앱으로 분리: Diz SW01 Custom

사용자 요청에 따라 기존 앱과 구분되는 앱 이름·앱 ID·APK 파일명을 적용했습니다. APK 파일명만 바꾸면 Android에서 별도 앱으로 인식되지 않으므로 설치 식별자와 Provider·자체 권한 이름도 함께 분리합니다.

| 항목 | 이전 기준 빌드 | 커스텀 빌드 |
| --- | --- | --- |
| 설치 이름 | SMART-TIME PRO | Diz SW01 Custom |
| 앱 ID | com.sma.smartv3.pro | com.diz.sw01.custom |
| 표시 버전 | 2.1.3.4 | 0.1.0 |
| versionCode | 8413 | 1 |
| APK | SMART_TIME_PRO_2.1.3.4_ARM64_TEST.apk | Diz_SW01_Custom_0.1.0_ARM64_TEST.apk |

대상 휴대전화는 사용자 확인에 따라 Galaxy S25 **SM-S931N**입니다. Android·One UI 버전은 아직 확인하지 않았습니다. 워치는 Diz-SW01입니다.

## 변경 내용

- 매니페스트 package 및 앱·런처 표시 이름.
- 각 locale의 `app_name` 문자열.
- 앱의 Provider authorities를 새 앱 ID의 네임스페이스로 분리.
- 동적 수신기용 자체 signature permission의 선언·사용 이름.
- 앱 ID에 종속되는 intent action 및 callback host/path 식별자.
- 버전 메타데이터와 결과 APK 파일명.

설정은 [`profiles/diz-sw01-custom.json`](../profiles/diz-sw01-custom.json)에 있습니다. 구현은 [`scripts/ApplyIdentity.py`](../scripts/ApplyIdentity.py)이며 변경 내역은 [`analysis/custom_identity_changes.json`](../analysis/custom_identity_changes.json)에 기록합니다.

## 정적 검증 결과

[`analysis/custom_identity_verification.json`](../analysis/custom_identity_verification.json)에 결과를 기록했습니다. 컴파일된 APK의 앱 ID·영문/한국어 표시 이름·런처 이름·버전을 확인했습니다. Provider authorities는 기존 앱과 겹치지 않으며 DEX 21개·네이티브 라이브러리 50개·원래 리소스 ID 30,432개를 보존했습니다. APK 서명 v2·v3 및 ZIP 정렬도 검증했습니다. 이 결과는 악성코드 안전성 또는 기기 설치 허용 검증이 아닙니다.

## 유지한 내용과 제약

Java/JNI 구현 클래스의 네임스페이스와 DEX를 임의로 바꾸지 않았습니다. 원래 클래스명을 참조하는 매니페스트 항목은 원래 구현을 가리키도록 보존했습니다. 블루투스 프로토콜·건강 데이터 처리·서버 주소·민감 권한도 이 식별자 변경에서 제거하거나 수정하지 않았습니다. 원 앱의 아이콘·기타 내부 브랜딩은 아직 남아 있습니다.

정적 검색에서 원 앱 ID의 문자열은 알림 채널 ID(`com.sma.smartv3.biz.OXO1`), BuildConfig 성격의 상수(`...paycertificationapi.i1i1IOiO`), Ximalaya 콘텐츠 SDK의 appId 설정(`...paycertificationapi.l87`)에도 남아 있었습니다. 알림 채널은 각 앱 범위에 속하며 설치 ID와 다릅니다. 외부 SDK의 계약·등록 식별자를 임의로 바꿔 새 자격으로 가장하지 않았습니다. 이런 잔존 문자열과 구현 클래스의 원래 이름은 앱 설치 ID를 이전 값으로 되돌리는 것이 아니지만, 해당 SDK 기능은 별도 검토 대상입니다.

외부 로그인·지도·광고·결제·제조사 서버가 앱 ID나 인증서를 확인하면 별도의 등록과 설정이 필요할 수 있습니다. 새 앱 ID에서 모든 기존 기능이 동작한다고 보장하지 않습니다. 두 앱의 설치 식별자는 분리하지만 **동시에 같은 워치에 연결**할 수 있다는 뜻은 아닙니다.

## 보안 차단과 구분

이후 사용자 확인에서 **이 Custom 0.1.0 APK도 같은 보안 경고로 차단**됐습니다. [추가 점검 결과](INSTALLATION_AUDIT.md)에 서명·정렬·네이티브 분석과 남은 검증을 기록했습니다.

사용자가 이전 기준 APK 설치 시 ‘악성 앱으로 의심’ 경고를 보고했습니다. **앱 이름·앱 ID 분리는 이 보안 판정을 해제하거나 악성코드 안전성을 증명하지 않습니다.** 같은 민감 권한·SDK·실행 코드가 남아 있으므로 동일한 경고가 발생할 수 있습니다. [보안 차단 조사 기록](SECURITY_BLOCK.md)을 함께 확인하세요. 보안 경고가 나오면 설치를 보류하고 판정 주체의 공식 검토 절차를 진행해야 합니다.

## 빌드

```powershell
.\scripts\Restore-Workspace.ps1  # 새 환경에서만
.\scripts\Build.ps1
```

전체 복원 작업 공간은 이전 분석 Release의 번들을 사용합니다. 최신 저장소의 `Build.ps1`이 새 식별자 스크립트를 작업 공간에 복사하고 프로필을 적용합니다. 압축 번들 자체의 예전 스크립트만 실행하면 기존 앱 ID가 유지되므로 저장소의 최신 빌드 진입점을 사용하세요.

서명 키는 공개 저장소에 포함하지 않습니다. 현재 게시 APK는 로컬 테스트 키를 사용했으며 다른 환경에서 새 키를 만들면 이 커스텀 APK의 후속 업데이트로 설치되지 않을 수 있습니다. 별도 설치·실행·보안 판정·Diz-SW01 연결은 실제 기기에서 아직 검증하지 않았습니다.
