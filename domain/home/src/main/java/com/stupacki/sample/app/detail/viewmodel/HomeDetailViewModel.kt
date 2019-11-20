package com.stupacki.sample.app.detail.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

internal class HomeDetailViewModel : ViewModel() {

    private val mutableText = MutableLiveData<String>(FRAGMENT_TEXT)

    val text: LiveData<String> = mutableText

    companion object {
        private const val FRAGMENT_TEXT = "This is home Fragment"
    }
}