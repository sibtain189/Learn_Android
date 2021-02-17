package com.example.postrequestapikotlin

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface APIClient {


    @POST("posts")
    fun getPost(@Body requestModel : RequestModel) : Call<ResponseModel>

}