package com.cleanarchitectureapp.androidbase.data.database.daos

import androidx.room.Dao
import androidx.room.Query
import com.cleanarchitectureapp.androidbase.data.database.entities.CustomerEntity

@Dao
interface CustomerDao {

    @Query("select * from customer")
    fun getAll(): List<CustomerEntity>

}