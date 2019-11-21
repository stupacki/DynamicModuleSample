package com.stupacki.sample.app.navigation.injection

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.home.HomeNavigation
import com.stupacki.sample.app.navigation.main.MainNavigation
import com.stupacki.sample.app.navigation.notifications.NotificationsNavigation
import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton
import org.rewedigital.katana.dsl.get

object NavigationModule {

    const val NAV_CONTROLLER = "NAV_CONTROLLER"

    operator fun invoke(navController: NavController) = Module {

        singleton(NAV_CONTROLLER) { navController }

        singleton { MainNavigation(get(NAV_CONTROLLER)) }

        singleton { HomeNavigation(get(NAV_CONTROLLER)) }

        singleton { NotificationsNavigation(get(NAV_CONTROLLER), get()) }
    }
}