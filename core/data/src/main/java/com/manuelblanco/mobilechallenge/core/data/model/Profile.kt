package com.manuelblanco.mobilechallenge.core.data.model

import com.manuelblanco.mobilechallenge.core.database.model.ProfileEntity
import com.manuelblanco.mobilechallenge.core.network.model.NetworkProfileResults

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

fun NetworkProfileResults.asEntities(): List<ProfileEntity> {
    val page = this.info.page

    return this.results.map {
        ProfileEntity(
            profileId = it.login.id,
            titleName = it.name.title,
            firstName = it.name.first,
            lastName = it.name.last,
            email = it.email,
            city = it.location.city,
            state = it.location.state,
            country = it.location.country,
            largeImageUrl = it.picture.large,
            thumbnailUrl = it.picture.thumbnail,
            page = page
        )
    }
}