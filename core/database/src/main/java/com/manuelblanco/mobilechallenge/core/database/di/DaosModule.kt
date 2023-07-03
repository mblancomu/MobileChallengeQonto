package com.manuelblanco.mobilechallenge.core.database.di

import com.manuelblanco.mobilechallenge.core.database.ChallengeDatabase
import com.manuelblanco.mobilechallenge.core.database.dao.ProfileDao
import com.manuelblanco.mobilechallenge.core.database.dao.RemoteKeysDao
import com.manuelblanco.mobilechallenge.core.database.utils.TransactionProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    fun providesProfileDao(
        database: ChallengeDatabase,
    ): ProfileDao = database.profileDao()

    @Provides
    fun providesRemoteKeysDao(
        database: ChallengeDatabase,
    ): RemoteKeysDao = database.remoteKeyDao()

    @Provides
    fun providesTransactionProvider(
        database: ChallengeDatabase,
    ) = TransactionProvider(database)
}