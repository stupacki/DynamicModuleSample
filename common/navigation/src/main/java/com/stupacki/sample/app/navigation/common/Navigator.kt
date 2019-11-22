package com.stupacki.sample.app.navigation.common

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

interface Navigator {
    fun getNavController(fragment: Fragment) = fragment.findNavController()
}
