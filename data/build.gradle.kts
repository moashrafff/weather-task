import java.util.Properties

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.weather_task.data"
    compileSdk = BuildConfig.compileSdk

    defaultConfig {
        minSdk = BuildConfig.minSdk

        testInstrumentationRunner = BuildConfig.testInstrumentationRunner

        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())

    }

    compileOptions {
        sourceCompatibility = BuildConfig.sourceCompatibility
        targetCompatibility = BuildConfig.targetCompatibility
    }
    buildFeatures {
        buildConfig = true
    }
    buildTypes {
        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "WEATHER_API_KEY", "\"172e14a89b54196b0cb3f112ec94fbe9\"")

        }
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("String", "WEATHER_API_KEY", "\"172e14a89b54196b0cb3f112ec94fbe9\"")

        }
    }
    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of(BuildConfig.jvmTarget))
        }
    }
    kotlinOptions {
        jvmTarget = BuildConfig.jvmTarget
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation(AndroidX.coreKtx)

    // api calls - retrofit
    implementation(Retrofit.retrofit)
    implementation(Retrofit.retrofitConverter)
    implementation(Retrofit.okhttp)
    implementation(Retrofit.logginInterceptor)

    implementation(Hilt.hilt)
    kapt(Hilt.hiltAndroidCompiler)
    kapt(Hilt.hiltCompiler)
    implementation(AndroidX.workManagerKtx)

    // room
    implementation(Room.room)
    implementation(Room.roomKtx)
    kapt(Room.roomKapt)

    // gson
    implementation(Google.gson)

    // coroutines
    implementation(Kotlin.coroutines)
}