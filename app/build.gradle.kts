plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt")
    kotlin("plugin.serialization") version "2.0.21" // match the Kotlin version
}

android {
    namespace = "com.vicky7230.moviesearch"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.vicky7230.moviesearch"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {

    implementation(project(":feature:movie:ui"))
    implementation(project(":feature:movie:data"))
    implementation(project(":feature:movie:domain"))

    implementation(project(":feature:movie_details:ui"))
    implementation(project(":feature:movie_details:data"))
    implementation(project(":feature:movie_details:domain"))

    implementation(project(":core:common"))
    implementation(project(":core:feature_api"))
    implementation(project(":core:network"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //dagger2
    implementation(libs.dagger)
    implementation(libs.dagger.android)
    implementation(libs.dagger.android.support)
    kapt(libs.dagger.android.processor)
    kapt(libs.dagger.compiler)

    //Assisted Inject dependencies
    implementation(libs.assisted.inject.annotations.dagger2)
    kapt(libs.assisted.inject.processor.dagger2)

    implementation(libs.androidx.navigation.compose)

    //retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.kotlinx.serialization)
    implementation(libs.logging.interceptor)

    //kotlinx-serialization
    implementation(libs.kotlinx.serialization.json)
}