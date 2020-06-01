package com.example.gradlepluginissue.features

import com.example.gradlepluginissue.BaseApplicationClass

enum class FeatureName(val moduleName: String) {
    ModuleFeature("module1"),
}

interface Feature<T> {
    fun inject(dependencies: T)
}

interface ModuleFeature :
    Feature<ModuleFeature.Dependencies> {
    interface Dependencies {
        val application: BaseApplicationClass
    }
}