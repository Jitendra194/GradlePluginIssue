package com.example.gradlepluginissue.di

import com.example.gradlepluginissue.BaseApplicationClass
import com.example.gradlepluginissue.features.FeatureManager
import com.example.gradlepluginissue.features.FeatureManagerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {
    @Provides
    @Singleton
    fun providesFeatureManager(application: BaseApplicationClass): FeatureManager =
        FeatureManagerImpl(application)
}