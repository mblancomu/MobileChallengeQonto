plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.jacoco")
    id("mobilechallenge.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.network"
    compileSdk = 33

    buildFeatures {
        buildConfig = true
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

/*    implementation(project(":core:common"))
    implementation(project(":core:model"))*/
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