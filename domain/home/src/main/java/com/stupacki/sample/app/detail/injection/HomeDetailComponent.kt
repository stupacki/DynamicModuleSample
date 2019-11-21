package com.stupacki.sample.app.detail.injection

import com.stupacki.sample.app.core.CoreApplication
import org.rewedigital.katana.Component

internal object HomeDetailComponent {

    operator fun invoke() = Component(
        modules = listOf(
            HomeDetailModule()
        ),
        dependsOn = listOf(
            CoreApplication.coreComponent
        )
    )
}