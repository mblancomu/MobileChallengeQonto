package com.manuelblanco.mobilechallenge.feature.detail

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@HiltAndroidTest
class DetailScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun whenHasProfile_showsProfiles() {
        composeTestRule.setContent {
            DetailScreen(
                profileId = "0ae6ed03-9952-4641-a208-f4bef6d69dcc",
                viewModel = ,
                onClose = {}
            )
        }

    }
}