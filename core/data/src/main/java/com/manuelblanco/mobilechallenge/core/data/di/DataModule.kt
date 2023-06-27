package com.manuelblanco.mobilechallenge.core.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Manuel Blanco Murillo on 26/6/23.
 */

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    //Example of bind repo
    @Binds
    fun bindsMyRepository(

    )
}