package com.manuelblanco.mobilechallenge.core.network

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

interface NetworkDataSource {

    suspend fun getItem(): List<Nothing>
}