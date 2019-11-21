package com.stupacki.sample.app.navigation.injection

import com.stupacki.sample.app.navigation.home.HomeNavigation
import com.stupacki.sample.app.navigation.main.MainNavigation
import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton

object NavigationModule {

    operator fun invoke() = Module {

        singleton { MainNavigation() }

        singleton { HomeNavigation() }
    }
}