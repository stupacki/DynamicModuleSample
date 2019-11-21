package com.stupacki.sample.app.navigation.injection

import android.content.Context
import android.content.res.Resources
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.stupacki.sample.app.core.injection.CoreModule.NAV_CONTROLLER
import com.stupacki.sample.app.navigation.home.HomeNavigation
import com.stupacki.sample.app.navigation.main.MainNavigation
import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton
import org.rewedigital.katana.dsl.get

object NavigationModule {

    operator fun invoke() = Module {

        singleton { MainNavigation() }

        singleton { HomeNavigation() }
    }
}