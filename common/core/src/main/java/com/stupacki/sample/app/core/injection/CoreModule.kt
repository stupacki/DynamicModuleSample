package com.stupacki.sample.app.core.injection

import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.stupacki.sample.app.storage.R
import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton
import org.rewedigital.katana.dsl.get

object CoreModule {

    const val APPLICATION = "APPLICATION"
    const val APP_CONTEXT = "APP_CONTEXT"
    const val APP_RESOURCES = "APP_RESOURCES"
    const val NAV_CONTROLLER = "NAV_CONTROLLER"

    operator fun invoke(app: Application) = Module {

        singleton<Application>(APPLICATION) { app }

        singleton<Context>(APP_CONTEXT) { app.applicationContext }

        singleton<Resources>(APP_RESOURCES) { app.resources }
    }
}