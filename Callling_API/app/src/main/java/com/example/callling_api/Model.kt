package com.example.callling_api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Model {
var result1:String=""
    fun download(): String{

        val apiClient=Network.getInstance().create(APIClient::class.java)
        apiClient.getPost().enqueue(object : Callback<ResponseDTO>{
            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {

            }

            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {

                result1= response.body()?.url.toString()

            }


        })
        return result1
    }


}