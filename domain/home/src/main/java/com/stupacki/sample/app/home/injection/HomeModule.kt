package com.stupacki.sample.app.home.injection

import com.stupacki.sample.app.home.HomeViewModel
import org.rewedigital.katana.Module
import org.rewedigital.katana.androidx.viewmodel.viewModel

internal object HomeModule {

    operator fun invoke(): Module = Module {

        viewModel { HomeViewModel() }
    }
}