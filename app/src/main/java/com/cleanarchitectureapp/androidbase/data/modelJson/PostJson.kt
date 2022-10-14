package com.cleanarchitectureapp.androidbase.data.modelJson

import com.cleanarchitectureapp.androidbase.data.models.Post
import retrofit2.http.Body

class PostJson(
 val userId: Int?,
 val id: Int?,
 val title: String?,
 val body: String?
){
    fun toPost() : Post{
        return Post(
            userId = userId,
            id = id,
            title = title,
            body = body
        )
    }
}
