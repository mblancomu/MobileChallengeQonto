package com.manuelblanco.mobilechallenge.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.manuelblanco.mobilechallenge.core.database.dao.ProfileDao
import com.manuelblanco.mobilechallenge.core.database.dao.RemoteKeysDao
import com.manuelblanco.mobilechallenge.core.database.model.ProfileEntity
import com.manuelblanco.mobilechallenge.core.database.model.RemoteKeyEntity

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */
@Database(
    entities = [
        ProfileEntity::class,
        RemoteKeyEntity::class
    ],
    version = 1,
)
abstract class ChallengeDatabase : RoomDatabase() {
    abstract fun profileDao(): ProfileDao
    abstract fun remoteKeyDao(): RemoteKeysDao
}