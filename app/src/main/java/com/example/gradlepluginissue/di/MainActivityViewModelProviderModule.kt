package com.example.gradlepluginissue.di

import androidx.lifecycle.ViewModel
import com.example.gradlepluginissue.views.MainActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class MainActivityViewModelProviderModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainActivityViewModel(viewModel: MainActivityViewModel): ViewModel
}