package com.example.mysqldatabase

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatabaseHolder(val view: View): RecyclerView.ViewHolder(view) {

    val mTvTitle=view.findViewById<TextView>(R.id.tvText)
    val btnEdit=view.findViewById<Button>(R.id.btnEdit)
    val btnDelete=view.findViewById<Button>(R.id.btnDelete)

}