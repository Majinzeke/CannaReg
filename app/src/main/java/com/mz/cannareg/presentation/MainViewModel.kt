package com.mz.cannareg.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.mz.cannareg.data.MeasurableSensor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val humiditySensor: MeasurableSensor
) : ViewModel() {

    var isHumid by  mutableStateOf(false)

    init {
        humiditySensor.startListening()
        humiditySensor.setOnSensorValuesChangedListener { values ->
            val lux = values[0]
            isHumid = lux < 69.0f
        }
    }
}