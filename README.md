# Android

## AVD Manager(Android Virtual Device Manager)

- 가상 디바이스를 생성한다.
- BIOS 설정에서 가상화 기능을 활성화 해야 한다.
  - ASUS BIOS + Intel CPU에서는 `Advanced` > `CPU Configuration` > `Intel Virtualization Technology`를 `Enabled`로 설정한다.
  - ASUS BIOS + AMD CPU에서는 `Advanced` > `CPU Configuration` > `SVM Mode`를 `Enabled`로 설정한다.
- [CPU를 너무 많이 사용](https://stackoverflow.com/questions/37063267/high-cpu-usage-with-android-emulator-qemu-system-i386-exe)한다.

```ini
; On Linux/Mac the file is located at ~/.android/avd/<AVD_Name>.avd/config.ini
; On Windows the file is located at C:\Users\<username>\.android\avd\<AVD_Name>.avd\config.ini
hw.audioInput = no
hw.audioOutput = no

hw.GPS = no
```
