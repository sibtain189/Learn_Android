package com.example.retrofit_kotlin

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIClient {

    @GET("comments")
    fun getPost(@Query("postId") postId: Int) : Call<List<PostResponseModel>>


}


