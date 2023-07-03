package com.manuelblanco.mobilechallenge.feature.detail.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile
import com.manuelblanco.mobilechallenge.feature.detail.R

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

@Composable
fun ProfileContent(profile: ExtendedProfile, containerHeight: Dp) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))

        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
            Text(
                text = profile.name,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold
            )
        }

        ProfileRowInfo(stringResource(R.string.city), profile.city)

        ProfileRowInfo(stringResource(R.string.state), profile.state ?: "No Info")

        ProfileRowInfo(stringResource(R.string.country), profile.country)

        Spacer(Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}