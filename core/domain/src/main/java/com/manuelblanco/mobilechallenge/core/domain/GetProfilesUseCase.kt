package com.manuelblanco.mobilechallenge.core.domain

import androidx.paging.PagingData
import com.manuelblanco.mobilechallenge.core.data.repository.ProfilesRepository
import com.manuelblanco.mobilechallenge.core.database.model.ProfileEntity
import com.manuelblanco.mobilechallenge.core.model.data.Profile
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Manuel Blanco Murillo on 28/6/23.
 */
class GetProfilesUseCase @Inject constructor(
    private val profilesRepository: ProfilesRepository
) {

    operator fun invoke(): Flow<PagingData<Profile>> =
        profilesRepository.getProfiles()
}