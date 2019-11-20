package com.stupacki.sample.app.core

import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompat
import com.google.android.play.core.splitcompat.SplitCompatApplication
import com.stupacki.sample.app.core.injection.CoreComponent
import org.rewedigital.katana.Component

open class CoreApplication : SplitCompatApplication() {

    override fun onCreate() {
        super.onCreate()

        coreComponent = CoreComponent(this)
    }

    override fun attachBaseContext(context: Context?) {
        super.attachBaseContext(context)
        SplitCompat.install(this)
    }

    companion object {
        lateinit var coreComponent: Component
    }
}