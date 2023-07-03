package com.manuelblanco.mobilechallenge.feature.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manuelblanco.mobilechallenge.core.domain.GetProfileByIdUseCase
import com.manuelblanco.mobilechallenge.core.ui.utils.UIEvents
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Manuel Blanco Murillo on 30/6/23.
 */

@HiltViewModel
class DetailScreenViewModel @Inject constructor(
    private val getProfileByIdUseCase: GetProfileByIdUseCase
) : ViewModel() {

    private val _state: MutableStateFlow<DetailScreenState> = MutableStateFlow(DetailScreenState())
    val state: StateFlow<DetailScreenState> = _state.asStateFlow()

    private val _uiEvents: Channel<UIEvents> = Channel()
    val uiEvents = _uiEvents.receiveAsFlow()

    fun onEvent(event: DetailScreenEvents) {
        when (event) {
            is DetailScreenEvents.OnInitScreen -> getDetail(event.profileId)
        }
    }

    private fun getDetail(profileId: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    isLoading = true,
                    isShowDetailSuccessful = false,
                    profile = null
                )
            }
        }

        viewModelScope.launch {
            val profile = getProfileByIdUseCase(profileId)

            if (profile.firstOrNull() != null){
                _state.update {
                    it.copy(
                        isLoading = false,
                        profile = profile.firstOrNull(),
                        isShowDetailSuccessful = true,
                        isShowDetailFailed = false
                    )
                }
            } else {
                _state.update {
                    it.copy(
                        isLoading = false,
                        profile = null,
                        isShowDetailSuccessful = false,
                        isShowDetailFailed = true
                    )
                }
            }

        }
    }
}