package com.example.callling_api

import retrofit2.Call
import retrofit2.http.GET

interface APIClient {

    @GET("woof.json")
    fun getPost() : Call<ResponseDTO>

}