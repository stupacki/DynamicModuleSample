package com.stupacki.sample.app.core.injection

import android.app.Application
import android.content.Context
import android.content.res.Resources
import org.rewedigital.katana.Module
import org.rewedigital.katana.dsl.compact.singleton

object CoreModule {

    const val APPLICATION = "APPLICATION"
    const val APP_CONTEXT = "APP_CONTEXT"
    const val APP_RESOURCES = "APP_RESOURCES"

    operator fun invoke(app: Application) = Module {

        singleton<Application>(APPLICATION) { app }

        singleton<Context>(APP_CONTEXT) { app.applicationContext }

        singleton<Resources>(APP_RESOURCES) { app.resources }
    }
}