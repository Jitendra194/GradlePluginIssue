package com.example.gradlepluginissue.di

import com.example.gradlepluginissue.*
import com.example.gradlepluginissue.features.ModuleFeature
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Suppress("unused")
@Singleton
@Component(
    modules = [AndroidInjectionModule::class,
        ActivityBuilderModule::class,
        FeaturesModule::class,
        ViewModelFactoryModule::class,
        AppModule::class]
)
interface BaseApplicationComponent : AndroidInjector<BaseApplicationClass> {

    val moduleFeature: ModuleFeature.Dependencies

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: BaseApplicationClass): BaseApplicationComponent
    }
}