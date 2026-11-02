# 설치 실패 점검 결과 — 2026-11-02

**이후 실기기 진단 완료:** USB 연결로 Android 16/API 36, 4KB 페이지와 삼성 `UnknownSourceAppBlockActivity`에서의 차단을 확인했습니다. 아래는 그 전의 정적 점검 기록이며 최신 결론은 [실기기 진단](DEVICE_BLOCK_DIAGNOSIS.md)을 확인하세요.

사용자가 제공한 점검 기준을 실제 배포 APK에 적용했습니다. 검사 대상은 **Diz SW01 Custom 0.1.0**, SHA-256 `94331dac82401815115650592e012fe99fa2e59f43d4e860afa2a7b94a868b93`입니다. APK 파일은 이번 점검에서 변경하지 않았습니다.

사용자는 **Galaxy S25 SM-S931N에서 새 앱 ID 버전도 같은 ‘악성 앱으로 의심’ 경고로 차단됨**을 확인했습니다. Android·One UI 버전, 기기 페이지 크기, 판정 서비스의 세부 사유는 아직 미확인입니다.

## 결과 요약

| 항목 | 실제 확인 결과 | 해석 |
| --- | --- | --- |
| 최종 APK 서명 | 공식 SDK Build Tools 37.0.0의 apksigner로 v2·v3 검증 통과 | 현재 파일의 미서명·서명 후 변조 문제는 확인되지 않음. 안전성 판정과 별도 |
| 원본·수정본 인증서 | 서로 다른 인증서, 각각 서명 유효 | 원본을 업데이트할 키는 아니지만 새 앱 ID이므로 원본 업데이트 후보도 아님 |
| 앱 ID·표시 이름 | com.diz.sw01.custom / Diz SW01 Custom | 파일명만 바꾼 상태가 아님 |
| Provider·자체 권한 | 기존 앱과 authority 교집합 없음, 자체 permission 분리 | 정적 검사에서 원본과의 해당 식별자 충돌 없음 |
| SDK 선언 | minSdk 26 / targetSdk 36 | 오래된 targetSdk에 해당하는 형태가 아님. 실제 OS 버전은 미확인 |
| 분할 APK 구성 | 필수 split 요구 제거, DEX 21개·ARM64 .so 50개 포함 | 기본 APK만 배포해 네이티브 split을 빠뜨린 상태가 아님 |
| ZIP 16KB 정렬 | 공식 zipalign -c -P 16 -v 4 검사 통과 | APK ZIP 포장 정렬 검사 통과 |
| ELF 16KB 내부 정렬 | 50개 중 48개 충족, 음성 관련 2개 미충족 | 16KB 환경의 추가 호환성 문제. 현재 보안 차단 원인으로 확정하지 않음 |
| 민감 권한·서비스 | READ_SMS·알림 접근·연락처·통화기록·녹음 등이 원본에서 유지 | 기능별 필요성·동작·동의·데이터 전송을 더 검토해야 함 |
| 보안 경고 | 새 ID의 0.1.0에서도 동일한 차단을 사용자 확인 | 이름·앱 ID 분리만으로 해결되지 않음. 실제 판정 원인은 미확정 |

기계 판독 결과는 [installation_audit.json](../analysis/installation_audit.json), [식별자 검증](../analysis/custom_identity_verification.json), [서명 및 정렬 검사 로그](../analysis/installation-audit-logs)에 있습니다.

## 1. 원본과 수정본의 인증서

| 파일 | 인증서 SHA-256 |
| --- | --- |
| 제공된 원본 base APK | 22f1cfbef897405e5de13d0e86d42e939b8de7c0789025eb9d2d26b8cda54083 |
| 커스텀 APK | a80b353626387a9f1ee006775ea5c0f2e481d2f39b90b11ee2e53202e486a851 |

둘 다 유효한 서명이지만 같은 발행자가 아닙니다. 원본 위에 업데이트할 수 있는 인증서를 복원하거나 원 제작자의 개인키를 사용한 것이 아닙니다. 커스텀 APK는 별도 앱 ID를 사용합니다. 새 ID에서 versionCode 1은 원본 ID의 versionCode 8413과 비교되는 업데이트가 아닙니다.

Google은 [apksigner](https://developer.android.com/tools/apksigner)를 서명 검증 도구로 설명합니다. 이 검증 결과는 악성코드 검사 결과가 아닙니다. v1 서명이 없다는 것만으로 오류로 판단하지 않습니다. 이 APK는 minSdk 26이고 v2·v3 서명을 사용합니다.

## 2. 새로 발견한 네이티브 16KB 정렬 문제

다음 파일의 PT_LOAD 세그먼트가 16KB ELF 정렬 요건을 충족하지 않습니다.

- lib/arm64-v8a/libspeechenhancement.so
- lib/arm64-v8a/libspeechenhancement_jni.so

두 파일은 원본 ARM64 분할 APK에도 **바이트 단위로 동일하게** 들어 있습니다. 이번 재패키징이 새로 만든 바이너리 문제가 아닙니다. JNI 내보내기에는 `com.sma.smartv3.util.SpeechEnhancement` 관련 이름이 있으나, 해당 경로가 현재 모델에서 실제 실행되는지는 확인하지 않았습니다.

APK의 50개 .so는 모두 압축 상태이고 `extractNativeLibs=true`입니다. 따라서 **ZIP 정렬 검사 통과와 ELF 내부 정렬 문제는 함께 존재할 수 있습니다.** zipalign만 다시 실행해 ELF의 코드·데이터 배치를 고칠 수는 없습니다. 자세한 원자료는 [native_page_alignment_audit.json](../analysis/native_page_alignment_audit.json)에 있습니다.

[Android의 공식 16KB 안내](https://developer.android.com/guide/practices/page-sizes)는 ZIP 포장 정렬과 ELF 세그먼트 정렬을 각각 검사하도록 안내합니다. 16KB 환경의 정상 호환성을 확보하려면 해당 SDK의 호환 버전이나 원본 네이티브 소스로 재빌드해야 합니다. 바이너리 헤더의 숫자만 바꾸는 수정을 해결책으로 취급하지 않습니다. 현재 Galaxy S25의 실제 메모리 페이지 크기를 확인하지 않았으므로 이 문제를 사용자 기기의 현재 설치 차단 원인으로 단정하지 않습니다.

재현용 읽기 전용 검사:

```powershell
python scripts/AuditNativePages.py <APK전체경로> --output native-page-report.json
<BuildTools37경로>/zipalign.exe -c -P 16 -v 4 <APK전체경로>
java -jar <BuildTools37경로>/lib/apksigner.jar verify --verbose --print-certs <APK전체경로>
```

검사 도구는 Google 공식 `https://dl.google.com/android/repository/build-tools_r37_windows.zip`에서 추출해 사용했습니다. SDK 바이너리를 저장소에 추가하거나 전역 환경에 설치하지 않았습니다.

## 3. 권한과 SDK·동적 코드 로딩

READ_SMS와 알림 접근 서비스 등은 남아 있습니다. 이 점은 이미 알고 있는 검토 대상이며, 권한을 선언했다는 것만으로 악성을 확정할 수 없습니다. Google의 [Play Protect 개발자 가이드](https://developers.google.com/android/play-protect/warning-dev-guidance)는 민감 권한·실제 동작·SDK·사용자 동의를 함께 검토하도록 안내하고 워치로 알림을 전달하는 정상적 용도도 설명합니다.

새 SDK 추가를 확인하기 위해 기존 검증의 클래스 정의·네이티브 목록 보존과 더불어 원본/커스텀 DEX 21개의 문자열 풀을 비교했습니다. 새 문자열은 0개였으며 일부 원본 문자열은 재조립 후 제거돼 있었습니다. [비교 결과](../analysis/dex_string_pool_audit.json)를 참고하세요. **이 검사는 코드 동작이 모두 동일하거나 안전하다는 증명이 아닙니다.**

Java 복원본의 생성자 호출 검색에서 다음과 같은 동적 로딩 검토 후보가 확인됐습니다.

- Facebook Audience Network의 DynamicLoaderFactory: 패키지 assets의 audience_network DEX를 사용하는 경로.
- Google 광고 SDK 내부 zzbak, zzfxa, zzgfz: 파일 기반 DexClassLoader 생성 경로.
- 난독화된 공통 helper: InMemoryDexClassLoader 생성 경로.

동적 로더 참조는 원본 DEX에도 존재합니다. 모든 원격 다운로드·저장 경로·무결성 검증을 추적한 것은 아닙니다. Java 복원본에는 부정확한 메서드가 있으므로 보안 검토는 Smali와 실행 관찰로 확인해야 합니다. [동적 코드 로딩의 공식 위험 안내](https://developer.android.com/privacy-and-security/risks/dynamic-code-loading)를 기준으로 추가 검토가 필요합니다.

## 4. 현재 결론과 다음 작업

이 APK의 현재 증상은 **일반적인 서명 누락·Provider 충돌·split 누락을 확인한 것으로 설명되지 않습니다.** 사용자 보고에 따르면 새 ID에서도 보안 차단이 계속됩니다. 실제 악성 동작, 유사도, 민감 권한·SDK, 기타 정책 중 어떤 항목이 판정에 영향을 미쳤는지는 아직 확정하지 못했습니다. APK 이름이나 키를 더 바꿔 문제가 해결됐다고 주장하지 않습니다.

필요한 다음 작업은 다음과 같습니다.

1. 기기 Android·One UI 버전과 차단 주체·판정명을 확보하고 삼성 또는 Google의 공식 검토 절차를 확인.
2. 원하는 워치 기능에 필요한 권한·서비스·타사 SDK를 결정한 뒤, 불필요한 기능은 관련 호출·초기화·메뉴까지 함께 정리. 사용 기능과 데이터 접근 범위·동의도 함께 검토.
3. 16KB 지원이 필요하면 두 네이티브 라이브러리의 호환 버전 또는 소스를 확보하고, 실제 사용하는 기능 경로를 확인.
4. 보안 검토 후 실제 기기에서 설치·실행·Diz-SW01 연결과 서버 인증을 각각 검증.

이번 점검은 정적 파일 검사입니다. 새 APK를 생성하거나 보안 기능을 해제하거나 강제 설치하지 않았습니다. 제조사/Google에 APK나 개인 로그를 자동 전송하지 않았습니다. 보안 판정 검토는 [별도 조사 기록](SECURITY_BLOCK.md)과 연결해서 진행합니다.
