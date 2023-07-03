package com.manuelblanco.mobilechallenge.core.domain

import com.manuelblanco.mobilechallenge.core.data.repository.ProfilesRepository
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile
import com.manuelblanco.mobilechallenge.core.model.data.Profile
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Manuel Blanco Murillo on 28/6/23.
 */
class GetProfileByIdUseCase @Inject constructor(
    private val profilesRepository: ProfilesRepository
) {

    operator fun invoke(id: String): Flow<ExtendedProfile> =
        profilesRepository.getProfile(id)
}