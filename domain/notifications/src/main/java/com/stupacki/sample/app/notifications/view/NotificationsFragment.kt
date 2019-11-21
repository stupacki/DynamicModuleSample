package com.stupacki.sample.app.notifications.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.stupacki.sample.app.core.CoreApplication
import com.stupacki.sample.app.navigation.notifications.NotificationsNavigation
import com.stupacki.sample.app.notifications.R
import com.stupacki.sample.app.notifications.viewmodel.NotificationsViewModel
import kotlinx.android.synthetic.main.fragment_notifications.*
import org.rewedigital.katana.androidx.viewmodel.viewModel

class NotificationsFragment : Fragment() {

    private val component by lazy { CoreApplication.coreComponent }
    private val viewModel by component.viewModel<NotificationsViewModel>(this)
    private val notificationsNavigation by component.inject<NotificationsNavigation>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_notifications, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(this.viewLifecycleOwner, Observer {
            notificationsTextView.text = it
        })

        toHomeFeatureButton.setOnClickListener {
            notificationsNavigation.toHomeFeature()
        }
    }
}