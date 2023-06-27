package com.manuelblanco.mobilechallenge.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.manuelblanco.mobilechallenge.core.database.dao.ChallengeDao
import com.manuelblanco.mobilechallenge.core.database.model.ChallengeEntity

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */
@Database(
    entities = [
        ChallengeEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class ChallengeDatabase : RoomDatabase() {
    abstract fun challengeDao(): ChallengeDao
}