package com.example.module1.views

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.gradlepluginissue.di.ViewModelProviderFactory
import com.example.module1.R
import com.example.module1.databinding.ModuleFragmentBinding
import com.example.module1.featureImpl.moduleFeatureMainComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class ModuleFragment : Fragment(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var viewModelProviderFactory: ViewModelProviderFactory

    private lateinit var binding: ModuleFragmentBinding

    private val viewModel: ModuleViewModel by viewModels { viewModelProviderFactory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        moduleFeatureMainComponent.moduleFeatureComponent
            .create(this)
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.module_fragment, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

}