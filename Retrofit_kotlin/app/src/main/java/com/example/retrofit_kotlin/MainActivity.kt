package com.example.retrofit_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import androidx.recyclerview.widget.RecyclerView.LayoutManager as LayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var postAdapter: PostAdapter
    private var responseList: List<PostResponseModel> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
        setRecyclerAdapter()
    }

    private fun setRecyclerAdapter() {
        postAdapter= PostAdapter(responseList)
        val linearLayoutManager=LinearLayoutManager(this)
        recyclerView.apply {
            layoutManager=linearLayoutManager
            adapter=postAdapter
        }
    }

    private fun initListener() {
        btnGetData.setOnClickListener {
            callAPI()
        }
    }

    private fun callAPI() {
        val apiClient=Network.getInstance().create(APIClient::class.java)
        apiClient.getPost(etPostId.text.toString().toInt()).enqueue(object : retrofit2.Callback<List<PostResponseModel>>{
            override fun onFailure(call: Call<List<PostResponseModel>>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<List<PostResponseModel>>,
                response: Response<List<PostResponseModel>>
            ) {

                response.body()?.let {
                    responseList= it
                    postAdapter.updateData(responseList)
                }
            }

        })
    }
}