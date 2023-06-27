package com.manuelblanco.mobilechallenge.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import com.manuelblanco.mobilechallenge.core.database.model.ChallengeEntity

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Dao
interface ChallengeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(newsResources: List<Nothing>)

    @Query("SELECT count(*) FROM challengeEntity")
    fun getCount(): Flow<Int>
}