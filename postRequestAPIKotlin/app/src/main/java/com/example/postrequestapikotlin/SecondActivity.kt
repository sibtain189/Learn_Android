package com.example.postrequestapikotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            val title=intent.getStringExtra("title")
        val email=intent.getStringExtra("email")
        val request=intent.getStringExtra("req")
        val id=intent.getStringExtra("id")
            tvTitle.text=title
        tvEmail.text=email
        tvRequest.text=request
        tvId.text=id
    }
}