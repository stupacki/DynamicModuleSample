package com.stupacki.sample.app

import android.app.Application
import org.rewedigital.katana.Katana
import org.rewedigital.katana.android.AndroidKatanaLogger
import org.rewedigital.katana.android.environment.AndroidEnvironmentContext
import timber.log.Timber

class SampleApp : Application() {

    private val isDebug = BuildConfig.DEBUG

    override fun onCreate() {
        super.onCreate()

        startKatana()
        startTimber()
    }

    private fun startKatana() {
        if (isDebug) {
            Katana.logger = AndroidKatanaLogger
        }

        Katana.environmentContext = AndroidEnvironmentContext()
    }

    private fun startTimber() {
        if (isDebug) {
            Timber.plant(Timber.DebugTree())
        }
    }
}