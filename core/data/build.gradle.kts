plugins {
    id("mobilechallenge.android.library")
    id("mobilechallenge.android.library.jacoco")
    id("mobilechallenge.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.manuelblanco.mobilechallenge.core.data"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {

    implementation(project(":core:common"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:model"))
    implementation(project(":core:network"))
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.serialization.json)

//    testImplementation(project(":core:datastore-test"))
    testImplementation(project(":core:testing"))
}