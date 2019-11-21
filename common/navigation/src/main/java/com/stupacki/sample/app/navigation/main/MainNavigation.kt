package com.stupacki.sample.app.navigation.main

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.R

class MainNavigation {

    fun navigateToHomeFeature(navController: NavController) {
        navController.navigate(R.id.toHomeFeature)
    }

    fun navigateToDashboardFeature(navController: NavController) {
        navController.navigate(R.id.toHomeFeature)
    }

    fun navigateToNotificationsFeature(navController: NavController) {
        navController.navigate(R.id.toHomeFeature)
    }
}