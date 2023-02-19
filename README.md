# Android

## AVD Manager(Android Virtual Device Manager)

- 가상 디바이스를 생성한다.
- BIOS 설정에서 가상화 기능을 활성화 해야 한다.
  - ASUS BIOS + Intel CPU에서는 `Advanced` > `CPU Configuration` > `Intel Virtualization Technology`를 `Enabled`로 설정한다.
  - ASUS BIOS + AMD CPU에서는 `Advanced` > `CPU Configuration` > `SVM Mode`를 `Enabled`로 설정한다.
- 부팅 시 [CPU를 너무 많이 사용](https://stackoverflow.com/questions/37063267/high-cpu-usage-with-android-emulator-qemu-system-i386-exe)한다.
- 생성하면 여러 프로젝트에 걸쳐서 사용할 수 있다.

## 환경 변수

- [Docs](https://developer.android.com/studio/command-line/variables#envar)

| 환경 변수               | 설명                                                                                                                                                                                            | 경로                                                                                                        |
| ----------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `ANDROID_HOME`          | SDK 설치 디렉터리의 경로를 설정합니다.                                                                                                                                                          | Ubuntu(`$HOME/Android/Sdk`), macOS(`$HOME/Library/Android/sdk`), Windows(`$HOME\AppData\Local\Android\Sdk`) |
| `ANDROID_USER_HOME`     | Android SDK에 포함된 도구의 사용자 환경설정 디렉터리 경로를 설정합니다.                                                                                                                         | `$HOME/.android`                                                                                            |
| `REPO_OS_OVERRIDE`      | [sdkmanager](https://developer.android.com/studio/command-line/sdkmanager)를 사용하여 현재 시스템과 다른 운영체제용 패키지를 다운로드할 경우 이 변수를 windows, macosx 또는 linux로 설정합니다. | -                                                                                                           |
| `ANDROID_EMULATOR_HOME` | 사용자별 에뮬레이터 구성 디렉터리의 경로를 설정합니다.                                                                                                                                          | `$ANDROID_USER_HOME/avd`                                                                                    |

```ini
; $ANDROID_USER_HOME/avd/<AVD_Name>.avd/config.ini
hw.audioInput = no
hw.audioOutput = no

hw.GPS = no
```
