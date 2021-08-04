package com.example.android.marsphotos.network

import com.squareup.moshi.Json
import retrofit2.http.Url

data class MarsPhoto(
    val id: String, @Json(name = "img_src") val imgSrcUrl: String
)