package com.example.module1.di

import androidx.lifecycle.ViewModel
import com.example.gradlepluginissue.di.ViewModelKey
import com.example.module1.views.ModuleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelProviderModule {
    @Binds
    @IntoMap
    @ViewModelKey(ModuleViewModel::class)
    abstract fun bindPillsViewModel(viewModel: ModuleViewModel): ViewModel
}