package com.stupacki.sample.app.home.injection

import com.stupacki.sample.app.core.CoreApplication
import org.rewedigital.katana.Component

internal object HomeComponent {

    operator fun invoke() = Component(
        modules = listOf(
            HomeModule()
        ),
        dependsOn = listOf(
            CoreApplication.coreComponent
        )
    )
}