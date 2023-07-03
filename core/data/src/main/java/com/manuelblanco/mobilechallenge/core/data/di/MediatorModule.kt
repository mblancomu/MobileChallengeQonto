package com.manuelblanco.mobilechallenge.core.data.di

import com.manuelblanco.mobilechallenge.core.data.mediator.ProfilesRemoteMediator
import com.manuelblanco.mobilechallenge.core.database.dao.ProfileDao
import com.manuelblanco.mobilechallenge.core.database.dao.RemoteKeysDao
import com.manuelblanco.mobilechallenge.core.database.utils.TransactionProvider
import com.manuelblanco.mobilechallenge.core.network.retrofit.RetrofitNetworkApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Manuel Blanco Murillo on 28/6/23.
 */

@Module
@InstallIn(SingletonComponent::class)
object MediatorModule {
    @Provides
    fun providesProfilesRemoteMediator(
        profilesApiService: RetrofitNetworkApi,
        profileDao: ProfileDao,
        remoteKeysDao: RemoteKeysDao,
        transactionProvider: TransactionProvider
    ) = ProfilesRemoteMediator(
        profilesApiService,
        profileDao,
        remoteKeysDao,
        transactionProvider
    )
}