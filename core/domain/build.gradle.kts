plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.jacoco")
    kotlin("kapt")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.domain"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:model"))
    implementation(libs.hilt.android)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)

    kapt(libs.hilt.compiler)

    testImplementation(project(":core:testing"))
}