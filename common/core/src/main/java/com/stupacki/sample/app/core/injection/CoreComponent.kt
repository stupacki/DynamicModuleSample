package com.stupacki.sample.app.core.injection

import android.app.Application
import com.stupacki.sample.app.navigation.injection.NavigationComponent
import org.rewedigital.katana.Component

object CoreComponent {

    operator fun invoke(app: Application) = Component(
        modules = listOf(
            CoreModule(app)
        ),
        dependsOn = listOf(
            NavigationComponent()
        )
    )
}