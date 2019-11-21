package com.stupacki.sample.app.navigation.home

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.R

class HomeNavigation(private val navController: NavController) {

    fun navigateToHome() {
        navController.navigate(R.id.toHome)
    }

    fun navigateToHomeDetail() {
        navController.navigate(R.id.toHomeDetail)
    }
}

