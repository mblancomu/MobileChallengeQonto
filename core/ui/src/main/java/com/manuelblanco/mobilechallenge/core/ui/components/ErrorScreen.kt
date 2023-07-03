package com.manuelblanco.mobilechallenge.core.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

@Composable
fun ErrorScreen(message: String) {
    Text(
        text = message,
        style = MaterialTheme.typography.bodySmall,
        textAlign = TextAlign.Center
    )
}