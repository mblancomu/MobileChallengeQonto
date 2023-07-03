package com.manuelblanco.mobilechallenge.feature.profiles

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.manuelblanco.mobilechallenge.core.domain.GetProfilesUseCase
import com.manuelblanco.mobilechallenge.core.model.data.Profile
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Manuel Blanco Murillo on 27/6/23.
 */

@HiltViewModel
class ProfilesViewModel @Inject constructor(
    private val getProfilesUseCase: GetProfilesUseCase,
) : ViewModel() {

    fun getProfiles(): Flow<PagingData<Profile>> =
        getProfilesUseCase()

}