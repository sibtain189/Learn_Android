package com.example.retrofit_kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private var responseList: List<PostResponseModel>) : RecyclerView.Adapter<PostViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return PostViewHolder(view)
    }


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

        val response=responseList[position]
        holder.setData(response)

    }

    override fun getItemCount(): Int {
        return  responseList.size
    }

    fun updateData(responseList: List<PostResponseModel>){
        this.responseList=responseList
        notifyDataSetChanged()
    }
}