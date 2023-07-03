package com.manuelblanco.mobilechallenge.core.data.repository

import androidx.paging.PagingData
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile
import com.manuelblanco.mobilechallenge.core.model.data.Profile
import kotlinx.coroutines.flow.Flow

/**
 * Created by Manuel Blanco Murillo on 28/6/23.
 */
interface ProfilesRepository {

    fun getProfiles(): Flow<PagingData<Profile>>

    fun getProfile(id: String): Flow<ExtendedProfile>
}