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

    @GET("/api/?seed=foobar")
    suspend fun getProfiles(
        @Query("page") page: Int?
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