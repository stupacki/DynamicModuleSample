package com.stupacki.sample.app.navigation.main

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.R

class MainNavigation(private val navController: NavController) {

    fun navigateToHomeFeature() {
        navController.navigate(R.id.toHomeFeature)
    }

    fun navigateToDashboardFeature() {
        navController.navigate(R.id.toHomeFeature)
    }

    fun navigateToNotificationsFeature() {
        navController.navigate(R.id.toHomeFeature)
    }
}