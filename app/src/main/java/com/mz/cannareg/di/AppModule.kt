package com.mz.cannareg.di

import android.content.Context
import com.mz.cannareg.data.AndroidHumidityController
import com.mz.cannareg.data.HumidityController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideHumidityController(@ApplicationContext context: Context): HumidityController {
        return AndroidHumidityController(context)
    }
}