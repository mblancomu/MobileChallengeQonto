plugins {
    id("mobilechallenge.android.feature")
    id("mobilechallenge.android.library.compose")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.feature.detail"
}

dependencies {
    implementation(libs.androidx.compose.material3.windowSizeClass)
}