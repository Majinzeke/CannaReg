package com.mz.cannareg.data


import android.annotation.SuppressLint
import android.content.Context
import com.mz.cannareg.data.model.HumidityDeviceDomain
import kotlinx.coroutines.flow.StateFlow

@SuppressLint("MissingPermission")
class AndroidHumidityController(
    private val context: Context,


    ) : HumidityController {

    override val scannedArea: StateFlow<List<HumidityDevice>> = TODO()
    override val recordedHumidity: StateFlow<List<HumidityDevice>>

    private val humidityManager by lazy {
        context.getSystemService(HumidityDeviceDomain::class.java)
    }


    override fun startDiscovery() {
        TODO("Not yet implemented")
    }

    override fun stopDiscovery() {
        TODO("Not yet implemented")
    }

    override fun release() {
        TODO("Not yet implemented")
    }


}