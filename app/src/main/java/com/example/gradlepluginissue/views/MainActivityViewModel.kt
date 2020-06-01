package com.example.gradlepluginissue.views

import androidx.lifecycle.ViewModel
import com.example.gradlepluginissue.features.FeatureManager
import com.example.gradlepluginissue.features.FeatureName
import com.example.gradlepluginissue.features.getFeature
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val featureManager: FeatureManager) : ViewModel() {
    fun launchModuleFeatureFragment() = featureManager getFeature FeatureName.ModuleFeature
}