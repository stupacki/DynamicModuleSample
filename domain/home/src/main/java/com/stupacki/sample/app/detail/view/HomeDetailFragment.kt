package com.stupacki.sample.app.detail.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.stupacki.sample.app.detail.injection.HomeDetailComponent
import com.stupacki.sample.app.detail.viewmodel.HomeDetailViewModel
import com.stupacki.sample.app.home.R
import com.stupacki.sample.app.navigation.home.HomeNavigation
import kotlinx.android.synthetic.main.fragment_home_detail.*
import org.rewedigital.katana.androidx.viewmodel.viewModel

internal class HomeDetailFragment : Fragment() {

    private val component by lazy { HomeDetailComponent() }
    private val viewModel by component.viewModel<HomeDetailViewModel>(this)
    private val homeNavigation by component.inject<HomeNavigation>()

    private val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_home_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(this.viewLifecycleOwner, Observer {
            homeDetailTextView.text = it
        })

        toHomeButton.setOnClickListener {
            homeNavigation.navigateToHome(navController)
        }
    }
}