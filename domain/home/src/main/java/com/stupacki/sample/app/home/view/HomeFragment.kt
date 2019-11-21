package com.stupacki.sample.app.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.stupacki.sample.app.home.R
import com.stupacki.sample.app.home.injection.HomeComponent
import com.stupacki.sample.app.home.viewmodel.HomeViewModel
import com.stupacki.sample.app.navigation.home.HomeNavigation
import kotlinx.android.synthetic.main.fragment_home.*
import org.rewedigital.katana.androidx.viewmodel.viewModel

internal class HomeFragment : Fragment() {

    private val component by lazy { HomeComponent() }
    private val viewModel by component.viewModel<HomeViewModel>(this)
    private val homeNavigation by component.inject<HomeNavigation>()

    private val navController: NavController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.text.observe(this.viewLifecycleOwner, Observer {
            homeTextView.text = it
        })

        toHomeDetailButton.setOnClickListener {
            homeNavigation.navigateToHomeDetail()
        }
    }
}