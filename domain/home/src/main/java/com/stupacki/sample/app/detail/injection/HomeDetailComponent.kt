package com.stupacki.sample.app.detail.injection

import org.rewedigital.katana.Component

internal object HomeDetailComponent {

    operator fun invoke() = Component(modules = listOf(HomeDetailModule()))
}