package com.cleanarchitectureapp.androidbase.data.services

import com.cleanarchitectureapp.androidbase.base.network.BaseRemoteService
import com.cleanarchitectureapp.androidbase.base.network.NetworkResult
import com.cleanarchitectureapp.androidbase.data.apis.StackOverFlowApi
import com.cleanarchitectureapp.androidbase.data.modelJson.QuestionItemsJson
import javax.inject.Inject

class StackOverFlowRemoteService @Inject constructor(private val stackOverFlowApi: StackOverFlowApi) : BaseRemoteService() {

    suspend fun getQuestions(page:Int, pageSize:Int): NetworkResult<QuestionItemsJson>{
        val parameters = mutableMapOf<String,String>()
        parameters["page"] = page.toString()
        parameters["pageSize"] = pageSize.toString()
        parameters["site"] = "stackoverflow"
        return  callApi { stackOverFlowApi.getQuestions(parameters = parameters) }
    }

}