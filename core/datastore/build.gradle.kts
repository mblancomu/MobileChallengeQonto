plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.jacoco")
    id("mobilechallenge.android.hilt")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.datastore"
    testOptions {
        unitTests {
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(libs.androidx.dataStore.preferences)
    implementation(libs.kotlinx.coroutines.android)

//    testImplementation(project(":core:datastore-test"))
    testImplementation(project(":core:testing"))
}