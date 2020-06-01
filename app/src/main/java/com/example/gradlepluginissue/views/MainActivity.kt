package com.example.gradlepluginissue.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.gradlepluginissue.R
import com.example.gradlepluginissue.di.ViewModelProviderFactory
import com.example.gradlepluginissue.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainActivityViewModel by viewModels { viewModelProviderFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel.launchModuleFeatureFragment()
    }
}