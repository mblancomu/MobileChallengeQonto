package com.manuelblanco.mobilechallenge.core.model.data

/**
 * Created by Manuel Blanco Murillo on 28/6/23.
 */
data class ExtendedProfile(
    val name: String,
    val email: String,
    val city: String,
    val state: String?,
    val country: String,
    val imageUrl: String
)
