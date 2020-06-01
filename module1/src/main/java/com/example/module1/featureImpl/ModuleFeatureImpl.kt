package com.example.module1.featureImpl

import com.example.gradlepluginissue.features.ModuleFeature
import com.example.module1.di.DaggerModuleFeatureMainComponent
import com.example.module1.di.ModuleFeatureMainComponent
import com.google.auto.service.AutoService

internal lateinit var moduleFeatureMainComponent: ModuleFeatureMainComponent
    private set

@AutoService(ModuleFeature::class)
class ModuleFeatureImpl : ModuleFeature {
    override fun inject(dependencies: ModuleFeature.Dependencies) {
        if (::moduleFeatureMainComponent.isInitialized) {
            return
        } else {
            moduleFeatureMainComponent =
                DaggerModuleFeatureMainComponent.factory().create(this, dependencies)
        }
    }
}