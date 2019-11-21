package com.stupacki.sample.app.notifications.injection

import com.stupacki.sample.app.navigation.injection.NavigationModule.NAV_CONTROLLER
import com.stupacki.sample.app.notifications.viewmodel.NotificationsViewModel
import org.rewedigital.katana.Module
import org.rewedigital.katana.androidx.viewmodel.viewModel
import org.rewedigital.katana.dsl.get

internal object NotificationsModule {

    operator fun invoke(): Module = Module {

        viewModel { NotificationsViewModel() }
    }
}