package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfileLocation(
    val city: String,
    val state: String,
    val country: String
)
