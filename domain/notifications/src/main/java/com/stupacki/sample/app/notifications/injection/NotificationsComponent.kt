package com.stupacki.sample.app.notifications.injection

import com.stupacki.sample.app.core.CoreApplication
import org.rewedigital.katana.Component

internal object NotificationsComponent {

    operator fun invoke(): Component = Component(
        modules = listOf(NotificationsModule()),
        dependsOn = listOf(CoreApplication.coreComponent)
    )
}