# MovieSearch Android App

A modern Android application built with Jetpack Compose for searching and viewing movie information.
This app follows clean architecture principles with a modular structure and uses the latest Android
development practices.

## Features

- Search for movies
- View detailed movie information
- Modern UI built with Jetpack Compose
- Clean architecture with modular design
- Dependency injection with Dagger 2
- Network requests with Retrofit
- JSON serialization with Kotlinx Serialization

## Screenshots

<!-- ![Movie Search](screenshots/movie_search.png) -->
<!-- ![Movie Details](screenshots/movie_details.png) -->

*Screenshots will be added here*

## Architecture

The app follows Clean Architecture principles with a multi-module structure:

- **app**: Main application module
- **feature/movie**: Movie search functionality
- **feature/movie_details**: Movie details functionality
- **core/common**: Common utilities and components
- **core/feature_api**: Feature API definitions
- **core/network**: Network layer

## Libraries Used

### Core Libraries

- **Kotlin** (2.0.21) - Primary programming language
- **Android Gradle Plugin** (8.10.0) - Build system
- **Jetpack Compose** (2024.09.00 BOM) - Modern UI toolkit
- **AndroidX Core KTX** (1.16.0) - Kotlin extensions for Android

### UI & Navigation

- **Material3** - Material Design 3 components
- **Navigation Compose** (2.9.0) - Navigation for Compose
- **Activity Compose** (1.10.1) - Activity integration with Compose
- **Coil Compose** (3.2.0) - Image loading for Compose

### Dependency Injection

- **Dagger 2** (2.56.2) - Dependency injection framework
- **Assisted Inject** (0.8.1) - Assisted injection for Dagger

### Network

- **Retrofit** (2.11.0) - HTTP client
- **OkHttp Logging Interceptor** (4.12.0) - Network request logging
- **Kotlinx Serialization** (1.8.1) - JSON serialization

### Testing

- **JUnit** (4.13.2) - Unit testing framework
- **AndroidX Test** (1.2.1) - Android testing
- **Espresso** (3.6.1) - UI testing

## Requirements

- Android API 24+ (Android 7.0+)
- Target SDK: 35
- Kotlin 2.0.21
- Android Studio Koala or newer

## Installation

1. Clone the repository

```bash
git clone [repository-url]
```

2. Open the project in Android Studio

3. Build and run the project

## License

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
