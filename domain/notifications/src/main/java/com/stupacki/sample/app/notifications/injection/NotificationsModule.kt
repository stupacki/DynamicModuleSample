package com.stupacki.sample.app.notifications.injection

import com.stupacki.sample.app.notifications.viewmodel.NotificationsViewModel
import org.rewedigital.katana.Module
import org.rewedigital.katana.androidx.viewmodel.viewModel

internal object NotificationsModule {

    operator fun invoke(): Module = Module {

        viewModel { NotificationsViewModel() }
    }
}
