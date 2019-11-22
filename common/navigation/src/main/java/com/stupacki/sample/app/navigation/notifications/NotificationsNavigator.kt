package com.stupacki.sample.app.navigation.notifications

import androidx.fragment.app.Fragment
import com.stupacki.sample.app.navigation.R
import com.stupacki.sample.app.navigation.common.Navigator

interface NotificationsNavigator: Navigator {

    fun Fragment.toHomeFeature() {
        getNavController(this).navigate(R.id.toHomeFeature)
    }
}
