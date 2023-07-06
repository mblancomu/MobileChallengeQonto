package com.manuelblanco.mobilechallenge.feature.detail.components

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

@Composable
fun SuccessProfileScreen(profile: ExtendedProfile) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints(modifier = Modifier.weight(1f)) {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    ProfileHeader(
                        scrollState,
                        profile.imageUrl,
                        this@BoxWithConstraints.maxHeight
                    )
                    ProfileContent(profile, this@BoxWithConstraints.maxHeight)
                }
            }

        }
    }
}