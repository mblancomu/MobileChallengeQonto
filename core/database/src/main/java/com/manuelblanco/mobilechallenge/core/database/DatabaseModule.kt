package com.manuelblanco.mobilechallenge.core.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesChallengeDatabase(
        @ApplicationContext context: Context,
    ): ChallengeDatabase = Room.databaseBuilder(
        context,
        ChallengeDatabase::class.java,
        "challenge-database",
    ).build()
}