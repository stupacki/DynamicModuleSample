package com.stupacki.sample.app.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class HomeViewModel : ViewModel() {

    private val mutableText = MutableLiveData<String>(FRAGMENT_TEXT)

    val text: LiveData<String> = mutableText

    companion object {
        private const val FRAGMENT_TEXT = "This is home Fragment"
    }
}