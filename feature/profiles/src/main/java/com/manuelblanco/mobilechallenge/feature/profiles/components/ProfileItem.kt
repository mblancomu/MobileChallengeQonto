package com.manuelblanco.mobilechallenge.feature.profiles.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import com.manuelblanco.mobilechallenge.core.model.data.Profile

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */

@Composable
fun ProfileItem(profile: Profile, navigateToProfile: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxSize().padding(4.dp).clickable { navigateToProfile() },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (profile.thumbnailUrl != null) {
                var isImageLoading by remember { mutableStateOf(false) }

                val painter = rememberAsyncImagePainter(
                    model = profile.thumbnailUrl,
                )

                isImageLoading = when (painter.state) {
                    is AsyncImagePainter.State.Loading -> true
                    else -> false
                }

                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 6.dp, vertical = 3.dp)
                            .height(100.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        painter = painter,
                        contentDescription = "Poster Image",
                        contentScale = ContentScale.FillBounds,
                    )

                    if (isImageLoading) {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .padding(horizontal = 6.dp, vertical = 3.dp),
                            color = MaterialTheme.colorScheme.primary,
                        )
                    }
                }
            }
            Column {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    text = profile.name
                )
                Text(
                    color = Color.LightGray,
                    modifier = Modifier
                        .padding(vertical = 12.dp, horizontal = 8.dp),
                    text = profile.email
                )
            }
        }
    }
}
