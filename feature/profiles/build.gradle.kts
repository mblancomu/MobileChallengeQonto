plugins {
    id("mobilechallenge.android.feature")
    id("mobilechallenge.android.library.compose")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.feature.profiles"
}

dependencies {
    implementation(libs.androidx.paging.common)
    implementation(libs.androidx.paging.compose)
}