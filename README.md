Free, Unlimited, Ad-Free, and super fast Telegram with built-in reliable proxy 
Bypass Telegram restrictions for banned countries Or use it as secondary Telegram!

Бесплатная, неограниченная, без рекламы и супер быстрая Telegram со встроенным надежным прокси
Обойти ограничения Telegram для запрещенных стран или использовать его в качестве вторичного Telegram!

 تلگرام آزاد، بدون محدودیت، بدون تبلیغات، رایگان و سریع با پراکسی پایدار درونی
جهت دور زدن تحریم ها برای کشورهای دارای مشکل ارتباطی، همچنین قابل استفاده به عنوان تلگرام دوم

مفت ، لا محدود ، اشتہار سے پاک ، اور بلٹ ان قابل اعتماد پراکسی کے ساتھ سپر فاسٹ ٹیلیگرام
کالعدم ممالک کیلئے بائی پاس ٹیلیگرام پابندیاں یا اسے ثانوی ٹیلیگرام کے طور پر استعمال کریں!

## Telegram messenger for Android

[Telegram](https://telegram.org) is a messaging app with a focus on speed and security. It's superfast, simple and free.
This repo contains the official source code for [Telegram App for Android](https://play.google.com/store/apps/details?id=org.telegram.messenger).

## Creating your Telegram Application

We welcome all developers to use our API and source code to create applications on our platform.
There are several things we require from **all developers** for the moment.

1. [**Obtain your own api_id**](https://core.telegram.org/api/obtaining_api_id) for your application.
2. Please **do not** use the name Telegram for your app — or make sure your users understand that it is unofficial.
3. Kindly **do not** use our standard logo (white paper plane in a blue circle) as your app's logo.
3. Please study our [**security guidelines**](https://core.telegram.org/mtproto/security_guidelines) and take good care of your users' data and privacy.
4. Please remember to publish **your** code too in order to comply with the licences.

### API, Protocol documentation

Telegram API manuals: https://core.telegram.org/api

MTproto protocol manuals: https://core.telegram.org/mtproto

### Compilation Guide

**Note**: In order to support [reproducible builds](https://core.telegram.org/reproducible-builds), this repo contains dummy release.keystore,  google-services.json and filled variables inside BuildVars.java. Before publishing your own APKs please make sure to replace all these files with your own.

You will require Android Studio 3.4, Android NDK rev. 20 and Android SDK 8.1

1. Download the Telegram source code from https://github.com/DrKLO/Telegram ( git clone https://github.com/DrKLO/Telegram.git )
2. Copy your release.keystore into TMessagesProj/config
3. Fill out RELEASE_KEY_PASSWORD, RELEASE_KEY_ALIAS, RELEASE_STORE_PASSWORD in gradle.properties to access your  release.keystore
4.  Go to https://console.firebase.google.com/, create two android apps with application IDs org.telegram.messenger and org.telegram.messenger.beta, turn on firebase messaging and download google-services.json, which should be copied to the same folder as TMessagesProj.
5. Open the project in the Studio (note that it should be opened, NOT imported).
6. Fill out values in TMessagesProj/src/main/java/org/telegram/messenger/BuildVars.java – there's a link for each of the variables showing where and which data to obtain.
7. You are ready to compile Telegram.

### Localization

We moved all translations to https://translations.telegram.org/en/android/. Please use it.

# Free Stickers App

A simple Android app that provides free stickers for messaging.

## Features
- Free stickers for all users
- Easy to use interface
- No premium restrictions

## Download
You can download the latest APK from the [Releases](https://github.com/Suraj08832/freeee/releases) page.

## Installation
1. Download the APK from the releases page
2. Enable "Install from Unknown Sources" in your Android settings
3. Open the downloaded APK file
4. Click "Install"

## Usage
1. Open the app
2. Browse through the available stickers
3. Click on any sticker to use it

## Building from Source
1. Clone this repository
2. Open the project in Android Studio
3. Build the project
4. Run on your device or emulator
