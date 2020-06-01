package com.example.gradlepluginissue.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Suppress("unused")
@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}