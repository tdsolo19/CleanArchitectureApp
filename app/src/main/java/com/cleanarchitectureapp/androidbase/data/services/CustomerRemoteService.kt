package com.cleanarchitectureapp.androidbase.data.services

import com.cleanarchitectureapp.androidbase.data.apis.CustomerAPI
import javax.inject.Inject

class CustomerRemoteService @Inject constructor(private val customerAPI: CustomerAPI) {
}