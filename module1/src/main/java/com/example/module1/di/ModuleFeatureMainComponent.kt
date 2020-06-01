package com.example.module1.di

import com.example.gradlepluginissue.features.ModuleFeature
import com.example.module1.featureImpl.ModuleFeatureImpl
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

@Component(
    modules = [ModuleFeatureMainModule::class],
    dependencies = [ModuleFeature.Dependencies::class]
)
interface ModuleFeatureMainComponent : AndroidInjector<ModuleFeatureImpl> {

    val moduleFeatureComponent: ModuleFeatureComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance moduleFeatureImpl: ModuleFeatureImpl,
            pillsFeature: ModuleFeature.Dependencies
        ): ModuleFeatureMainComponent
    }
}