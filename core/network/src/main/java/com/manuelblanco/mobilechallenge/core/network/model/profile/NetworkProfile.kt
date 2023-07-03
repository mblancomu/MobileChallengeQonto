package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfile(
    val name: NetworkProfileName,
    val email: String,
    val location: NetworkProfileLocation,
    val login: NetworkProfileId,
    val picture: NetworkProfilePictures,
)