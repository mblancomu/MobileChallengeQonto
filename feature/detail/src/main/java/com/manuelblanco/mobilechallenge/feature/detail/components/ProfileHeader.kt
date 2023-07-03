package com.manuelblanco.mobilechallenge.feature.detail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import coil.compose.rememberAsyncImagePainter

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */


@Composable
fun ProfileHeader(
    scrollState: ScrollState,
    imageUrl: String,
    containerHeight: Dp
) {
    val offset = (scrollState.value / 2)
    val offsetDp = with(LocalDensity.current) { offset.toDp() }
    val painter = rememberAsyncImagePainter(
        model = imageUrl,
    )

    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
            .padding(top = offsetDp),
        painter = painter,
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}