package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfilePictures(
    val large:String = "",
    val thumbnail: String = ""
)