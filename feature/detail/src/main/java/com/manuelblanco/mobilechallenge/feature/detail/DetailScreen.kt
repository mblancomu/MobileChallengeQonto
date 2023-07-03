package com.manuelblanco.mobilechallenge.feature.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.manuelblanco.mobilechallenge.core.ui.components.ErrorScreen
import com.manuelblanco.mobilechallenge.feature.detail.components.SuccessProfileScreen

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */
@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
fun DetailScreen(
    profileId: String,
    viewModel: DetailScreenViewModel = hiltViewModel(),
    onClose: () -> Unit
) {
    val state: DetailScreenState by viewModel.state.collectAsStateWithLifecycle()
    val profile = state.profile

    LaunchedEffect(key1 = true) {
        profileId.let { DetailScreenEvents.OnInitScreen(it) }.let { viewModel.onEvent(it) }
    }

    Dialog(
        onDismissRequest = {
            onClose()
        },
        properties = DialogProperties(
            usePlatformDefaultWidth = false
        )
    ) {
        Card(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        ){
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = Color.Transparent
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    when {
                        state.isLoading -> CircularProgressIndicator()
                        state.isShowDetailSuccessful -> profile?.let { SuccessProfileScreen(it) }
                        state.isShowDetailFailed -> ErrorScreen(stringResource(R.string.error_detail_screen))
                    }
                }
            }
        }
    }
}