package com.example.gradlepluginissue.di

import com.example.gradlepluginissue.views.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [MainActivityViewModelProviderModule::class])
    abstract fun contributesMainActivity(): MainActivity
}