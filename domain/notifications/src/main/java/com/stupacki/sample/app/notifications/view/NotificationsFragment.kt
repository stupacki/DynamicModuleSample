package com.stupacki.sample.app.notifications.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.stupacki.sample.app.navigation.notifications.NotificationsNavigator
import com.stupacki.sample.app.notifications.R
import com.stupacki.sample.app.notifications.injection.NotificationsComponent
import com.stupacki.sample.app.notifications.viewmodel.NotificationsViewModel
import kotlinx.android.synthetic.main.fragment_notifications.*
import org.rewedigital.katana.androidx.viewmodel.viewModel

class NotificationsFragment : Fragment(), NotificationsNavigator {

    private val component by lazy { NotificationsComponent() }
    private val viewModel by component.viewModel<NotificationsViewModel>(this)

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
            toHomeFeature()
        }
    }
}
