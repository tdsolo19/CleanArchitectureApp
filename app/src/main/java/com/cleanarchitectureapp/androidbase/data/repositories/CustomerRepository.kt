package com.cleanarchitectureapp.androidbase.data.repositories

import com.cleanarchitectureapp.androidbase.data.services.CustomerLocalService
import com.cleanarchitectureapp.androidbase.data.services.CustomerRemoteService
import com.cleanarchitectureapp.androidbase.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher

class CustomerRepository constructor(
    private val customerRemoteService: CustomerRemoteService,
    private val customerLocalService: CustomerLocalService,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) {
}