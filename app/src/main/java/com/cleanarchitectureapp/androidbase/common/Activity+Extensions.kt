package com.cleanarchitectureapp.androidbase.common

import android.app.Activity
import com.cleanarchitectureapp.androidbase.CustomApplication

val Activity.customApplication: CustomApplication
get() = application as CustomApplication