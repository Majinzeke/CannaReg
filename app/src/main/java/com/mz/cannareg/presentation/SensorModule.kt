package com.mz.cannareg.presentation

import android.app.Application
import com.mz.cannareg.data.HumiditySensors
import com.mz.cannareg.data.MeasurableSensor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object SensorModule {

    @Provides
    @Singleton
    fun provideHumiditySensor(app: Application): MeasurableSensor {
        return HumiditySensors(app)
    }
}