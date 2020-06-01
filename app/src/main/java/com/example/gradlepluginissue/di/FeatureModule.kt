package com.example.gradlepluginissue.di

import com.example.gradlepluginissue.BaseApplicationClass
import com.example.gradlepluginissue.features.ModuleFeature
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object FeaturesModule {
    @Provides
    @Singleton
    fun providesModuleFeatureDependencies(application: BaseApplicationClass): ModuleFeature.Dependencies {
        return object :
            ModuleFeature.Dependencies {
            override val application: BaseApplicationClass
                get() = application
        }
    }
}