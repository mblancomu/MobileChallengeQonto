package com.manuelblanco.mobilechallenge.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Entity(tableName = "challengeEntity")
data class ChallengeEntity(

    @ColumnInfo(name = "newsResourceId")
    val newsResourceId: String,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "content")
    val content: String,
)
