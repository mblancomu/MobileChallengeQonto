package com.manuelblanco.mobilechallenge.core.database.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.manuelblanco.mobilechallenge.core.database.model.ProfileEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Dao
interface ProfileDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(profile: List<ProfileEntity>)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertProfile(profile: ProfileEntity)

    @Query(value = "SELECT * FROM profiles WHERE profileId = :profileId")
    fun getProfileEntity(profileId: String): Flow<ProfileEntity>

    @Query(value = "SELECT * FROM profiles Order By page")
    fun getProfileEntities(): PagingSource<Int, ProfileEntity>

    @Query(value = "DELETE FROM profiles")
    suspend fun deleteAll()

    @Query("SELECT count(*) FROM profiles")
    fun getCount(): Flow<Int>
}