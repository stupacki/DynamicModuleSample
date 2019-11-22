package com.stupacki.sample.app.navigation.main.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.stupacki.sample.app.core.CoreApplication
import com.stupacki.sample.app.navigation.R
import com.stupacki.sample.app.navigation.injection.NavigationModule
import kotlinx.android.synthetic.main.activity_main_navigation.*
import org.rewedigital.katana.Component

abstract class MainNavigationActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.mainNavHost) }

    private val module by lazy {
        NavigationModule(navController).apply {
            //Injection must happened before adding the graph, otherwise the first click will fail
            CoreApplication.addModule(this)
        }
    }
    private val component by lazy { Component(modules = listOf(module)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_navigation)

        navController.setGraph(R.navigation.navigation_main)

        bottomNavView.setupWithNavController(navController)
        bottomNavView.inflateMenu(R.menu.bottom_nav_menu)
    }
}
