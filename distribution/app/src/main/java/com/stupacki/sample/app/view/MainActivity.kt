package com.stupacki.sample.app.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stupacki.sample.app.navigation.main.view.MainNavigationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, MainNavigationActivity::class.java))
    }
}
