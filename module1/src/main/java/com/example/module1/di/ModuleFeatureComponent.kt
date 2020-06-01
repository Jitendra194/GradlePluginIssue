package com.example.module1.di

import com.example.module1.views.ModuleFragment
import dagger.BindsInstance
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Subcomponent(
    modules = [AndroidInjectionModule::class,
        ViewModelProviderModule::class]
)
interface ModuleFeatureComponent : AndroidInjector<ModuleFragment> {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance pillsFragment: ModuleFragment): ModuleFeatureComponent
    }
}