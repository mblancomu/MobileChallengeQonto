package com.manuelblanco.mobilechallenge.feature.detail

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

sealed class DetailScreenEvents {
    data class OnInitScreen(val profileId: String) : DetailScreenEvents()
}