package com.cleanarchitectureapp.androidbase.data.apis

import com.cleanarchitectureapp.androidbase.data.modelJson.PostJson
import retrofit2.Response
import retrofit2.http.GET

interface JsonPlaceHolderApi {

    @GET ("/posts")
   suspend fun getAllPosts(): Response<List<PostJson>>

}