package com.cleanarchitectureapp.androidbase.base.network

public open class NetworkErrorException (val responseMessage: String? = null): Exception() {
}