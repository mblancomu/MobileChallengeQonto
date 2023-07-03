package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 29/6/23.
 */

@Serializable
data class NetworkProfileItem(
    val name: NetworkProfileName,
    val email: String,
    val location: NetworkProfileLocation,
    val id: NetworkProfileId,
    val picture: NetworkProfilePictures,
)