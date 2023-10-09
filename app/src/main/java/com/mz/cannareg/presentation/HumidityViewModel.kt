package com.mz.cannareg.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mz.cannareg.data.HumidityController
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

class HumidityViewModel @Inject constructor(
    private val humidityController: HumidityController
) : ViewModel() {

    private val _state = MutableStateFlow(HumidityUiState())
    val state = combine(
        humidityController.scannedArea,
        humidityController.recordedHumidity,
        _state
    ){ scannedArea, levelOfHumidity, state ->
        state.copy(
            scannedArea = scannedArea,
            confirmedArea = levelOfHumidity
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), _state.value)

    fun startScan(){
        humidityController.startDiscovery()
    }
    fun stopScan(){
        humidityController.stopDiscovery()
    }

}
