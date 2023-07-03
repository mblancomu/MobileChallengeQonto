plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.hilt")
    id("kotlinx-serialization")
}

val hostUrl: String = com.android.build.gradle.internal.cxx.configure.gradleLocalProperties(rootDir).getProperty("HOST_URL")

android {
    namespace = "com.manuelblanco.mobilechallenge.core.network"
    compileSdk = 33

    buildFeatures {
        buildConfig = true
    }

    buildTypes {
        debug {
            buildConfigField("String", "HOST_URL", hostUrl)
        }

        release {
            buildConfigField("String", "HOST_URL", hostUrl)
        }
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.svg)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)

    testImplementation(project(":core:testing"))
}