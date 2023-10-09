package com.mz.cannareg

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mz.cannareg.data.HumidityDevice
import com.mz.cannareg.ui.theme.CannaRegTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mz.cannareg.presentation.MainViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val humidityManager by lazy {
        applicationContext.getSystemService(HumidityDevice::class.java)
    }
    private val humidityAdapter by lazy {
        applicationContext.getSystemService(HumidityDevice::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val permissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { perms ->
            setContent {

                CannaRegTheme {
                    val viewModel = viewModel<MainViewModel>()
                    val isHumid = viewModel.isHumid

                }
            }
        }
    }
}

