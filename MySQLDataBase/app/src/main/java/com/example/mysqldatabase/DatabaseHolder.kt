package com.example.mysqldatabase

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatabaseHolder(val view : View): RecyclerView.ViewHolder(view) {

    val mTvTitle:TextView=view.findViewById(R.id.tvText)

}