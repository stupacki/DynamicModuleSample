package com.stupacki.sample.app.storage

import android.content.Context
import com.stupacki.sample.app.storage.model.MyObjectBox

import io.objectbox.BoxStore

class Storage(val boxStore: BoxStore) {

    object Builder {

        fun build(context: Context): Storage =
            MyObjectBox.builder().androidContext(context).build().let { Storage(it) }
    }
}