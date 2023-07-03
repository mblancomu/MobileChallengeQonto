package com.manuelblanco.mobilechallenge.core.data.di

import com.manuelblanco.mobilechallenge.core.data.repository.ProfilesRepository
import com.manuelblanco.mobilechallenge.core.data.repository.ProfilesRepositoryImpl
import com.manuelblanco.mobilechallenge.core.data.util.ConnectivityManagerNetworkMonitor
import com.manuelblanco.mobilechallenge.core.data.util.NetworkMonitor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsProfilesRepository(
        profilesRepository: ProfilesRepositoryImpl,
    ): ProfilesRepository

    @Binds
    fun bindsNetworkMonitor(
        networkMonitor: ConnectivityManagerNetworkMonitor,
    ): NetworkMonitor
}