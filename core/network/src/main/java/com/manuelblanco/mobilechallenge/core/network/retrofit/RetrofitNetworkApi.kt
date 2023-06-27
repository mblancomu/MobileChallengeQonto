package com.manuelblanco.mobilechallenge.core.network.retrofit

import kotlinx.serialization.Serializable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */
interface RetrofitNetworkApi {

    @GET(value = "items")
    suspend fun getTopics(
        @Query("id") ids: List<String>?,
    ): NetworkResponse<List<Nothing>>


}

@Serializable
data class NetworkResponse<T>(
    val data: T,
)