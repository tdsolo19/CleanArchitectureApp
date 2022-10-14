package com.cleanarchitectureapp.androidbase.common

import android.util.Log
import com.cleanarchitectureapp.androidbase.BuildConfig

object Logger {

    fun log(tag: String, message: String) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, message)
        }
    }

}