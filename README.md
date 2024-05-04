# Appium - Java - Cucumber - Stockbit

## Requirements
1. install java 15 <br> langkah-langkah untuk install java bisa di link dibawah ini : <br> https://www.programmerzamannow.com/pemrograman/java/dasar/menginstall-java/
2. install android studio and setup virtual device manager (avd emulator) <br> langkah-langkah install dan setup virtual device manager (avd emulator) bisa di link di bawah ini : <br> https://medium.com/michael-wallace/how-to-install-android-sdk-and-setup-avd-emulator-without-android-studio-aeb55c014264
3. install IDE bisa menggunakan IntelliJ IDEA atau Eclipse
3. install appium <br>
   Untuk berinteraksi dengan perangkat mobile dan menjalankan skrip otomatisasi, menginstal server Appium di sistem Anda sangat penting. Penting untuk memiliki Node.js dan npm (Node Package Manager) terinstal karena Appium dibangun di atas Node.js. <br> <br>
   Berikut langkah-langkah untuk menginstal Appium di Windows dari terminal menggunakan Node.js:
   - Langkah pertama adalah memeriksa apakah Node.js sudah terinstal di sistem.
     Untuk melakukannya, buka terminal dan jalankan perintah: node -v
   - Jika Node.js sudah terinstal di sistem, akan mengembalikan versi Node, jika tidak akan muncul pesan kesalahan yang menyatakan — ‘node is not recognized’, yang berarti Node.js tidak terinstal di sistem.
     Untuk menginstal Node.js, kunjungi situs resmi.
   - Setelah instalasi selesai, restart terminal dan jalankan perintah <br>  node -v lagi. Ini akan mengembalikan versi Node.
   - Jalankan perintah npm install -g appium yang akan menginstal Appium dari NPM. di terminal
   - Perintah di atas akan mengunduh dan menginstal Appium. Setelah selesai, verifikasi instalasi Appium di macOS atau Windows dengan menjalankan perintah berikut:
     appium –version
   - Anda dapat mengakses Appium dari baris perintah dengan menjalankan perintah appium. Sebagai contoh, jika Anda mendapatkan output yang dimulai dengan baris seperti ini: (Appium) Welcome to Appium v2.0.0, maka server Appium sudah berjalan. Anda dapat keluar dari server dengan menekan CTRL-C. <br> <br>
     Selain server appium, kita juga perlu menginstal driver appium:
   - Jalankan perintah appium driver install uiautomator2 yang akan menginstal driver Appium untuk Android.
   - Jalankan perintah appium driver install xcuitest yang akan menginstal driver Appium untuk iOS.
   - Setelah selesai, verifikasi instalasi driver Appium dengan menjalankan perintah:<br>
     appium driver list –installed. <br>

atau bisa mengikuti artikel dibawah ini <br> https://medium.com/@jignect/appium-with-java-a-comprehensive-guide-0fe6520cf697

## setup process of the project
1. buka terminal untuk menjalankan server appium dengan perintah : <br> appium
2. buka android studio dan jalankan avd emulator dengan cara :
   - buka android studio
   - click tree dot menu
   - click virtual device manager
   - click icon play pada emulator yang sudah di setup
3. clone project dari link github dibawah ini : <br> https://github.com/FikyAnggra/appium-java-cucumber-stockbit.git
4. buka project di IDE yang sudah di install
5. buka file baseStep di package : <br> src/test/java/stepDefinitions/baseStep.java
6. pada line 23 options.setDeviceName("fikydevice"); ganti "fikydevice" sesuai dengan nama avd emulator yang kamu gunakan
7. buka file testRunner di package : <br> src/test/java/testRunner.java
8. running file testRunner.java
9. atau bisa running dengan membuka file buyProduct di package : <br> src/test/resources/features/buyProduct.feature
