package com.mz.cannareg.data

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor


class HumiditySensors(
    context: Context
): AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_RELATIVE_HUMIDITY,
    sensorType = Sensor.TYPE_RELATIVE_HUMIDITY
) {
    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
        TODO("Not yet implemented")
    }
}

abstract class TemperatureSensors(
    context: Context
): AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE,
    sensorType = Sensor.TYPE_AMBIENT_TEMPERATURE,
)

