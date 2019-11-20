package com.stupacki.sample.app.home.injection

import org.rewedigital.katana.Component

internal object HomeComponent {

    operator fun invoke() = Component(modules = listOf(HomeModule()))
}