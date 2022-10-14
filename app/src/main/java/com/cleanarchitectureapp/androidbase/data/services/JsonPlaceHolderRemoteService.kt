package com.cleanarchitectureapp.androidbase.data.services

import com.cleanarchitectureapp.androidbase.base.network.BaseRemoteService
import com.cleanarchitectureapp.androidbase.base.network.NetworkResult
import com.cleanarchitectureapp.androidbase.data.apis.JsonPlaceHolderApi
import com.cleanarchitectureapp.androidbase.data.modelJson.PostJson
import javax.inject.Inject

class JsonPlaceHolderRemoteService @Inject constructor(private  val jsonPlaceHolderApi: JsonPlaceHolderApi) : BaseRemoteService() {

    suspend fun getAllPosts(): NetworkResult<List<PostJson>>{
        return callApi { jsonPlaceHolderApi.getAllPosts() }
    }

}