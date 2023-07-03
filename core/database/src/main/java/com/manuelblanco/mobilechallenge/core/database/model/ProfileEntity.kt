package com.manuelblanco.mobilechallenge.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile
import com.manuelblanco.mobilechallenge.core.model.data.Profile

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Entity(tableName = "profiles")
data class ProfileEntity(

    @PrimaryKey(autoGenerate = false)
    val profileId: String,
    val titleName: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val city: String,
    @ColumnInfo(defaultValue = "")
    val state: String,
    val country: String,
    @ColumnInfo(defaultValue = "")
    val largeImageUrl: String,
    @ColumnInfo(defaultValue = "")
    val thumbnailUrl: String,
    @ColumnInfo(name = "page")
    var page: Int,
)


fun ProfileEntity.asProfile() = Profile(
    id = profileId,
    name = """$firstName $lastName""",
    email = email,
    thumbnailUrl = thumbnailUrl
)

fun ProfileEntity.asExtendedProfile() = ExtendedProfile(
    name = """$firstName $lastName""",
    email = email,
    city = city,
    state = state,
    country = country,
    imageUrl = largeImageUrl
)