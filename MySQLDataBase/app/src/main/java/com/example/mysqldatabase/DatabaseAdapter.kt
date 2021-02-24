package com.example.mysqldatabase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DatabaseAdapter(var taskModel: ArrayList<TaskModel>,val listener: OnRowItemClicked) : RecyclerView.Adapter<DatabaseHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatabaseHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return DatabaseHolder(view)
    }

    override fun getItemCount(): Int {
        return taskModel.size
    }

    override fun onBindViewHolder(holder: DatabaseHolder, position: Int) {

        holder.mTvTitle.text = taskModel[position].title

        holder.btnEdit.setOnClickListener {
            listener.onEditButtonClicked(taskModel[position])
        }

        holder.btnDelete.setOnClickListener {
            listener.onDeleteButtonClicked(taskModel[position])
        }

    }
}