package com.example.mysqldatabase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DatabaseAdapter(var response:ArrayList<String>) : RecyclerView.Adapter<DatabaseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatabaseHolder {
val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return DatabaseHolder(view)
    }

    override fun getItemCount(): Int {

        return response.size

    }

    override fun onBindViewHolder(holder: DatabaseHolder, position: Int) {

        holder.mTvTitle.text=response[position]

    }
}