package com.manuelblanco.mobilechallenge.feature.detail

import com.manuelblanco.mobilechallenge.core.model.data.ExtendedProfile

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

data class DetailScreenState(
    val isLoading: Boolean = false,
    val profile: ExtendedProfile? = null,
    val isShowDetailSuccessful: Boolean = false,
    val isShowDetailFailed: Boolean = false
)