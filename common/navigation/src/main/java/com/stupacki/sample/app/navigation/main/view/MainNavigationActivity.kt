package com.stupacki.sample.app.navigation.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.stupacki.sample.app.navigation.R
import kotlinx.android.synthetic.main.activity_main_navigation.*

class MainNavigationActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.mainNavHost) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_navigation)

        NavigationUI.setupWithNavController(bottomNavView, navController)

        bottomNavView.inflateMenu(R.menu.bottom_nav_menu)
    }
}