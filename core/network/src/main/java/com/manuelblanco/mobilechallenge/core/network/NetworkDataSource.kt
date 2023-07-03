package com.manuelblanco.mobilechallenge.core.network

import com.manuelblanco.mobilechallenge.core.network.model.NetworkProfileResults
import com.manuelblanco.mobilechallenge.core.network.model.profile.NetworkProfile

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

interface NetworkDataSource {

    suspend fun getProfiles(page: Int? = null, pageSize: Int? = null): NetworkProfileResults

    suspend fun getProfile(id: String? = null): NetworkProfile
}