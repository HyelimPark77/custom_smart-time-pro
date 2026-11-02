# 복원 범위와 실제 수정 경로

## 입력과 출력

입력은 사용자가 제공한 `com.sma.smartv3.pro_2.1.3.4.xapk`입니다. 기본 APK, `config.arm64_v8a.apk`, `config.xxhdpi.apk`로 구성됩니다. API 26 이상, target API 36의 ARM64 구성입니다.

원본 APK는 수정하지 않았습니다. 복원된 Smali, XML, 이미지·assets, ARM64 라이브러리를 별도 작업 공간으로 추출했습니다. 원본 APK 해시는 [입력 인덱스](../analysis/input_manifest.json)에 있습니다.

## 읽기용 Java와 수정용 Smali

JADX의 Java 출력은 역컴파일한 표현입니다. Kotlin 코루틴·람다·제네릭·난독화된 제어 흐름은 원 소스와 다를 수 있습니다. `Method not decompiled`, `JADX ERROR`, `JADX WARN`, `goto` 등의 표식·형태를 확인해야 합니다. Java를 수정한 것만으로 APK에 반영되지 않습니다.

실제 APK에 반영할 변경은 `patches/base/`의 **Smali·XML·이미지·assets**에 적용합니다. [전체 코드 인덱스](../analysis/code_index.json)는 원래 클래스와 작업 공간의 Smali 및 존재하는 Java 파일 경로를 연결합니다. [복원 결함 목록](../analysis/decompilation_issues.json)에는 파일과 줄 번호가 있습니다.

`renames.jobf`는 도구가 생성한 이름 대응표입니다. 원 제작자의 `mapping.txt`가 아니며 원래 의미를 복구하는 사전이 아닙니다. 원래 변수명·주석·원본 Kotlin/Java 프로젝트·Gradle 의존성·서버 코드는 APK에 없으면 복구할 수 없습니다.

## 네이티브 코드

ARM64 `.so` 50개를 보존하고 동적 심볼을 추출했습니다. [네이티브 심볼 인덱스](../analysis/native_symbols.json)를 참고하세요. C/C++ 소스를 복구한 것은 아니며 심볼이 제거된 함수의 의미 복원에는 별도의 ARM64 분석과 실기기 관찰이 필요합니다. 제공된 XAPK에 없는 ARMv7·x86 라이브러리는 생성하지 않았습니다.

## 재조립을 위해 적용한 변경

1. ARM64 분할 APK의 `apktool.yml`에 Android framework ID 1을 추가했습니다. 빌드 도구의 기본 Android 속성 해석을 위한 설정입니다.
2. 단일 APK를 위해 밀도 리소스 163개의 공개 ID를 기본 리소스에 합쳤습니다. 분할 리소스의 임시 속성명 3개를 기본 속성명에 연결했습니다.
3. 분할 설치 요구 속성과 분할 설치 메타데이터를 통합 매니페스트에서 제거했습니다.
4. ARM64 라이브러리를 합치고 재조립한 기본 DEX를 그대로 사용했습니다.
5. 로컬 테스트 키로 서명했습니다. 앱의 패키지명·화면·계정·블루투스 프로토콜을 임의로 바꾸지 않았습니다.

이 변경은 실행 성공을 증명하지 않습니다. 정적 파일·리소스·서명 검증과 실기기 검증을 구분합니다.

## 도구

- JADX 1.5.6: https://github.com/skylot/jadx
- Apktool 3.0.3: https://github.com/iBotPeaches/Apktool
- uber-apk-signer 1.3.0 내 ApkSignerTool 및 zipalign: https://github.com/patrickfav/uber-apk-signer

서명 작업은 번들 도구의 외부 프로세스 호출 대신 zipalign 실행과 ApkSignerTool Java 진입점을 각각 사용했습니다. 실제 수행한 단계가 `scripts/Build-TestApk.ps1`에 반영되어 있습니다.
