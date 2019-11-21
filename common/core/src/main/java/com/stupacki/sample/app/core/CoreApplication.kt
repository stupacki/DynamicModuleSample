package com.stupacki.sample.app.core

import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompat
import com.google.android.play.core.splitcompat.SplitCompatApplication
import com.stupacki.sample.app.core.injection.CoreComponent
import org.rewedigital.katana.Component
import org.rewedigital.katana.Module

open class CoreApplication : SplitCompatApplication() {

    override fun onCreate() {
        super.onCreate()

        component = CoreComponent(this)
    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)

        SplitCompat.install(this)
    }

    companion object {
        private var component: Component? = null

        val coreComponent: Component
            get() = component?.let { it }
                ?: throw IllegalStateException("CoreComponent should not be null, but it is ... Get your things together ...")

        fun addModule(module: Module) {
            component = component?.plus(module)
        }
    }
}