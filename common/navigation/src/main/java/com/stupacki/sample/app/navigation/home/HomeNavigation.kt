package com.stupacki.sample.app.navigation.home

import androidx.navigation.NavController
import com.stupacki.sample.app.navigation.R

class HomeNavigation {

    fun navigateToHome(navController: NavController) {
        navController.navigate(R.id.toHome)
    }

    fun navigateToHomeDetail(navController: NavController) {
        navController.navigate(R.id.toHomeDetail)
    }
}

