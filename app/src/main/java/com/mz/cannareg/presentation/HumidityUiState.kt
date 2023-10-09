package com.mz.cannareg.presentation

import com.mz.cannareg.data.HumidityDevice

data class HumidityUiState(
    val scannedArea: List<HumidityDevice> = emptyList(),
    val confirmedArea: List<HumidityDevice> = emptyList(),
)