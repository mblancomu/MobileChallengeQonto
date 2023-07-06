package com.manuelblanco.mobilechallenge.core.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.manuelblanco.mobilechallenge.core.data.mediator.PAGE_SIZE
import com.manuelblanco.mobilechallenge.core.data.mediator.ProfilesRemoteMediator
import com.manuelblanco.mobilechallenge.core.database.dao.ProfileDao
import com.manuelblanco.mobilechallenge.core.database.model.asExtendedProfile
import com.manuelblanco.mobilechallenge.core.database.model.asProfile
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile
import com.manuelblanco.mobilechallenge.core.model.data.Profile
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


/*
 * Created by Manuel Blanco Murillo on 27/6/23.
*/

class ProfilesRepositoryImpl @Inject constructor(
    private val profileDao: ProfileDao,
    private val remoteMediator: ProfilesRemoteMediator
) : ProfilesRepository {

    @OptIn(ExperimentalPagingApi::class)
    override fun getProfiles(): Flow<PagingData<Profile>> =
        Pager(
            config = PagingConfig(
                pageSize = 4,
                enablePlaceholders = true,
            ),
            pagingSourceFactory = {
                profileDao.getProfileEntities()
            },
            remoteMediator = remoteMediator
        ).flow.map { profile ->
            profile.map { it::asProfile.invoke() }
        }

    override fun getProfile(id: String): Flow<ExtendedProfile> =
        profileDao.getProfileEntity(id).map { it.asExtendedProfile() }

}
