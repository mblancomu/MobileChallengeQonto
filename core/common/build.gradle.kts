plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.jacoco")
    id("mobilechallenge.android.hilt")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    testImplementation(project(":core:testing"))
}