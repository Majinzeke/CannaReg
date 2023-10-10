package com.mz.cannareg.data

typealias HumidityDataDomain = HumidityDevice

data class HumidityDevice(
    val humidityPercentage: Float,
    val humidityDayOfWeek: String,
)



