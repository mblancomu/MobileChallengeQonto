plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.compose")
    id("mobilechallenge.android.library.jacoco")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.ui"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.runtime.livedata)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.metrics)
    api(libs.androidx.tracing.ktx)

    debugApi(libs.androidx.compose.ui.tooling)

//    implementation(project(":core:analytics"))
//    implementation(project(":core:designsystem"))
//    implementation(project(":core:domain"))
//    implementation(project(":core:model"))
    implementation(libs.androidx.browser)
    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    implementation(libs.kotlinx.datetime)

    androidTestImplementation(project(":core:testing"))
}