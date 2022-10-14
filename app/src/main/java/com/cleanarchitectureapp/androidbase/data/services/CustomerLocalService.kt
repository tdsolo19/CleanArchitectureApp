package com.cleanarchitectureapp.androidbase.data.services

import com.cleanarchitectureapp.androidbase.data.database.daos.CustomerDao
import javax.inject.Inject

class CustomerLocalService @Inject constructor(private val customerDao: CustomerDao) {
}