# 🎬 MovieSearch Android App

<div style="text-align: center;">

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white)

**A modern Android application built with Jetpack Compose for searching and viewing movie
information.**

*Clean architecture • Modern UI • Latest Android practices*

</div>

---

## ✨ Features

- 🔍 **Search for movies** - Find your favorite movies instantly
- 📱 **View detailed movie information** - Get comprehensive movie details
- 🎨 **Modern UI built with Jetpack Compose** - Beautiful, responsive interface
- 🏗️ **Clean architecture with modular design** - Maintainable and scalable code
- 💉 **Dependency injection with Dagger 2** - Efficient dependency management
- 🌐 **Network requests with Retrofit** - Reliable API communication
- 📄 **JSON serialization with Kotlinx Serialization** - Fast data parsing

## 📸 Screenshots

<div style="text-align: center;">

| ![Movie Search](screenshots/movie_search.png) | ![Movie Details](screenshots/movie_details.png) |
|:---------------------------------------------:|:-----------------------------------------------:|
|            **Movie Search Screen**            |            **Movie Details Screen**             |

</div>

## 🏗️ Architecture

The app follows **Clean Architecture** principles with a multi-module structure:

```
📦 MovieSearch
├── 🏠 app                    # Main application module
├── 🎬 feature/movie          # Movie search functionality
├── 📋 feature/movie_details  # Movie details functionality
├── 🔧 core/common           # Common utilities and components
├── 🔌 core/feature_api      # Feature API definitions
└── 🌐 core/network          # Network layer
```

## 📚 Libraries Used

### 🚀 Core Libraries

| Library                                                                                                 | Version    | Description                   |
|---------------------------------------------------------------------------------------------------------|------------|-------------------------------|
| ![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white)            | 2.0.21     | Primary programming language  |
| ![Android](https://img.shields.io/badge/AGP-3DDC84?style=flat&logo=android&logoColor=white)             | 8.10.0     | Build system                  |
| ![Compose](https://img.shields.io/badge/Compose-4285F4?style=flat&logo=jetpack-compose&logoColor=white) | 2024.09.00 | Modern UI toolkit             |
| ![AndroidX](https://img.shields.io/badge/AndroidX-3DDC84?style=flat&logo=android&logoColor=white)       | 1.16.0     | Kotlin extensions for Android |

### 🎨 UI & Navigation

| Library                                                                                                       | Version | Description                       |
|---------------------------------------------------------------------------------------------------------------|---------|-----------------------------------|
| ![Material3](https://img.shields.io/badge/Material3-757575?style=flat&logo=material-design&logoColor=white)   | Latest  | Material Design 3 components      |
| ![Navigation](https://img.shields.io/badge/Navigation-4285F4?style=flat&logo=jetpack-compose&logoColor=white) | 2.9.0   | Navigation for Compose            |
| ![Activity](https://img.shields.io/badge/Activity-3DDC84?style=flat&logo=android&logoColor=white)             | 1.10.1  | Activity integration with Compose |
| ![Coil](https://img.shields.io/badge/Coil-FF6B35?style=flat&logo=coil&logoColor=white)                        | 3.2.0   | Image loading for Compose         |

### 💉 Dependency Injection

| Library                                                                                       | Version | Description                    |
|-----------------------------------------------------------------------------------------------|---------|--------------------------------|
| ![Dagger](https://img.shields.io/badge/Dagger2-FF6B35?style=flat&logo=dagger&logoColor=white) | 2.56.2  | Dependency injection framework |
| ![Assisted Inject](https://img.shields.io/badge/Assisted%20Inject-FF6B35?style=flat)          | 0.8.1   | Assisted injection for Dagger  |

### 🌐 Network

| Library                                                                                                        | Version | Description             |
|----------------------------------------------------------------------------------------------------------------|---------|-------------------------|
| ![Retrofit](https://img.shields.io/badge/Retrofit-48B983?style=flat&logo=retrofit&logoColor=white)             | 2.11.0  | HTTP client             |
| ![OkHttp](https://img.shields.io/badge/OkHttp-48B983?style=flat&logo=okhttp&logoColor=white)                   | 4.12.0  | Network request logging |
| ![Kotlinx](https://img.shields.io/badge/Kotlinx%20Serialization-7F52FF?style=flat&logo=kotlin&logoColor=white) | 1.8.1   | JSON serialization      |

## 📋 Requirements

- 📱 **Android API 24+** (Android 7.0+)
- 🎯 **Target SDK:** 35
- 🔧 **Kotlin:** 2.0.21
- 🛠️ **Android Studio:** Koala or newer

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone [repository-url]
   ```

2. **Open the project in Android Studio**

3. **Build and run the project**

## 📄 License

```
MIT License

Copyright (c) 2025 MovieSearch

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

<div style="text-align: center;">

**Made with ❤️ and ☕ using Android & Kotlin**

⭐ Star this repository if you found it helpful!

</div>
