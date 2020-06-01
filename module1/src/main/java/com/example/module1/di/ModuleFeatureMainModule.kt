package com.example.module1.di

import com.example.module1.di.ModuleFeatureComponent
import dagger.Module

@Module(subcomponents = [ModuleFeatureComponent::class])
object ModuleFeatureMainModule