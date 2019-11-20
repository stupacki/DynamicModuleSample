package com.stupacki.sample.app.detail.injection

import com.stupacki.sample.app.home.viewmodel.HomeViewModel
import org.rewedigital.katana.Module
import org.rewedigital.katana.androidx.viewmodel.viewModel

internal object HomeDetailModule {

    operator fun invoke(): Module = Module {

        viewModel { HomeViewModel() }
    }
}