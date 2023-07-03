package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfileName(
    val title: String,
    val first: String,
    val last: String
)
