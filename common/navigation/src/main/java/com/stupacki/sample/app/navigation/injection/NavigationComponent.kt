package com.stupacki.sample.app.navigation.injection

import com.stupacki.sample.app.core.CoreApplication
import org.rewedigital.katana.Component


object NavigationComponent {

    operator fun invoke() = Component(
        modules = listOf(NavigationModule()),
        dependsOn = listOf(CoreApplication.coreComponent)
    )
}
