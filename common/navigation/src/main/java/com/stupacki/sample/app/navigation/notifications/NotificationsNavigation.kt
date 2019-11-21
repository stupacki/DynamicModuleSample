package com.stupacki.sample.app.navigation.notifications

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.main.MainNavigation

class NotificationsNavigation(
    private val navController: NavController,
    private val mainNavigation: MainNavigation
) {

    fun toHomeFeature() {
        mainNavigation.navigateToHomeFeature()
    }
}