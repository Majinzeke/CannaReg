package com.mz.cannareg.data

import kotlinx.coroutines.flow.StateFlow

interface HumidityController {
    val scannedArea: StateFlow<List<HumidityDevice>>
    val recordedHumidity: StateFlow<List<HumidityDevice>>

    fun startDiscovery()
    fun stopDiscovery()

    fun release()
}