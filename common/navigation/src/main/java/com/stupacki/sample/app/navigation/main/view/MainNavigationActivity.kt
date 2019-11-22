package com.stupacki.sample.app.navigation.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.stupacki.sample.app.navigation.R
import kotlinx.android.synthetic.main.activity_main_navigation.*

abstract class MainNavigationActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.mainNavHost) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_navigation)

        navController.setGraph(R.navigation.navigation_main)

        bottomNavView.setupWithNavController(navController)
        bottomNavView.inflateMenu(R.menu.bottom_nav_menu)
    }
}
