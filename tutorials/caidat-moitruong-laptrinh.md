# Cài đặt môi trường lập trình Android với Android Studio trên hệ điều hành Ubuntu 16.04

* **Thực hiện:** Thi Minh Nhựt - **Email:** thiminhnhut@gmail.com

* **Thời gian:** Ngày 29 tháng 08 năm 2017

## Nguồn tham khảo

1. [Install Android Studio](https://developer.android.com/studio/install.html)

1. [Download Genymotion 2.10.0](https://www.genymotion.com/download/)

1. [Genymotion Android Devices on Ubuntu 16.04](https://www.youtube.com/watch?v=IajLCWoqE3c)

1. [Install Virtualbox on Ubuntu 16.04 LTS](https://askubuntu.com/questions/779095/install-virtualbox-on-ubuntu-16-04-lts)

## Nội dung thực hiện

### Cài đặt Android Studio trên hệ điều hành Ubuntu

* Tải Android Studio từ địa chỉ https://developer.android.com/studio/index.html

* Giải nén file `zip` vừa tải về (ví dụ:`android-studio-ide-162.4069837-linux.zip`) được thư mục `android-studio`.

* Di chuyển thư mục `android-studio` vào thư mục `/usr/local/`

```bash
$ sudo mv android-studio /usr/local/
```

* Cài đặt Android Studio:

```bash
$ cd /usr/local/android-studio/bin
$ ./studio.sh
```

* Tạo shortcut cho Android Stuido vào `Configure > Create Desktop Entry`

* Cài đặt thêm thư viện cho hệ điều hành Ubuntu bản 64 bit:

```bash
$ sudo apt-get install libc6:i386 libncurses5:i386 libstdc++6:i386 lib32z1 libbz2-1.0:i386
```

### Cài đặt máy ảo Genymotion trên hệ điều hành Ubuntu 16.04

* Tạo tài khoản, đăng nhập và vào địa chỉ https://www.genymotion.com/download để [Download Genymotion](https://www.genymotion.com/download)

* Yêu cầu hệ thống là:

        Ubuntu 16.04 (Xenial Xerus) - 64bit or above
        
        Debian 9 (Stretch), Fedora 26 - 64bit
        
        64 bit CPU, with VT-x or AMD-V capability, enabled in BIOS settings
        
        Recent and dedicated GPU
        
        400 MB disk space
        
        2GB RAM

* Cài đặt `virtualbox`:

```bash
$ sudo apt-get install virtualbox
```

* Cài đặt Genymotion: di chuyển đến thư mục chứa file cài đặt Genymotion (ví dụ: `genymotion-2.10.0-linux_x64.bin`, rồi dùng lệnh sau:

```bash
$ sudo bash genymotion-2.10.0-linux_x64.bin

Installing for all users.

A previous installation already exists in folder [/opt/genymobile/genymotion]. Overwrite [y/n] ? y


- Trying to find VirtualBox toolset .................... OK (Valid version of VirtualBox found: 5.0.40_Ubuntur115130)
- Removing old installation ............................ OK
- Extracting files ..................................... OK (Extract into: [/opt/genymobile/genymotion])
- Installing launcher icon ............................. OK

Installation done successfully.

You can now use these tools from [/opt/genymobile/genymotion]:
- genymotion
- genymotion-shell
- gmtool
```

