package com.manuelblanco.mobilechallenge.core.network.retrofit

import com.manuelblanco.mobilechallenge.core.network.model.NetworkProfileResults
import com.manuelblanco.mobilechallenge.core.network.model.profile.NetworkProfile
import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */
interface RetrofitNetworkApi {

    @GET("/api/")
    suspend fun getProfiles(
        @Query("page") page: Int?,
        @Query("results") results: Int,
        @Query("seed") seed: String,
        @Query("inc") fields: String
    ): NetworkProfileResults

    @GET("/api/")
    suspend fun getProfile(
        @Query("id") id: String?,
    ): NetworkResponse<NetworkProfile>

}

@Serializable
data class NetworkResponse<T>(
    val data: T,
)