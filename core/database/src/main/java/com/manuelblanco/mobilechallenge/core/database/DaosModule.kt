package com.manuelblanco.mobilechallenge.core.database

import com.manuelblanco.mobilechallenge.core.database.dao.ChallengeDao
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
    fun providesChallengeDao(
        database: ChallengeDatabase,
    ): ChallengeDao = database.topicDao()
}