package com.stupacki.sample.app.navigation.injection

import org.rewedigital.katana.Component


object NavigationComponent {

    operator fun invoke() = Component(
        modules = listOf(NavigationModule())
    )
}
