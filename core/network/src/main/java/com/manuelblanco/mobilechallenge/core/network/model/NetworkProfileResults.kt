package com.manuelblanco.mobilechallenge.core.network.model

import com.manuelblanco.mobilechallenge.core.network.model.profile.NetworkProfile
import com.manuelblanco.mobilechallenge.core.network.model.profile.NetworkProfileInfo
import kotlinx.serialization.Serializable

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@Serializable
data class NetworkProfileResults(
    val results:List<NetworkProfile>,
    val info: NetworkProfileInfo
)
