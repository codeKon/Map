# Map
A simple MapView using SupportMapFragment


//if you want to use adb-tools download adb-tools.zip from the following link:

http://www.brutzelstube.de/2010/adb-unter-windows-installieren/

unzip the file and copy to C://adb-tools
you can use it if you open cmd


//if emulator location settings not working do the following steps

Program & Features - > Windows Features - > activate Telnet-Client
Android Sdk/tools open cmd

->telnet localhost 5554

how to auth 
User/currentUser
//open the file .emulator_console_auth_token with Editor and get the token

->auth <your_token>

//set mock location to the emulator
->geo fix -77.380987 38.098765


//it would be not work at emulator if Google Play Services not installed
//download .apk`s and copy at Android Sdk/platform-tools

Android Sdk/tools/emulator <@your-device-name> -no-boot-anim &
adb wait-for-device
adb shell stop
adb remount
adb push GmsCore.apk /system/priv-app
adb push GoogleServicesFramework.apk /system/priv-app
adb push GoogleLoginService.apk /system/priv-app
adb push Phonesky.apk /system/priv-app
adb shell start




