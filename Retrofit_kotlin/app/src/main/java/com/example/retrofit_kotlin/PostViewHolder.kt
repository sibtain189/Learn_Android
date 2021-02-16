package com.example.retrofit_kotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class PostViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {


    fun setData(responce : PostResponseModel){

        view.apply {

            tvName.text=responce.name
            tvEmail.text=responce.email
            tvBody.text=responce.body

        }

    }

}