package com.manuelblanco.mobilechallenge.core.network.model.profile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfileId(
    @SerialName("uuid")
    val id: String
)