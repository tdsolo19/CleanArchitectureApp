package com.cleanarchitectureapp.androidbase.data.modelJson

import com.cleanarchitectureapp.androidbase.data.models.Question
import com.squareup.moshi.Json

data class QuestionItemsJson(
    val items: List<Question>?,
    @Json(name =  "has_more") val hasMore: Boolean? = false
)
