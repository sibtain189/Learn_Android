package com.example.callling_api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Interface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = Presenter(getModel(), this)
        btnDownload.setOnClickListener {

            presenter.downloading()

        }


    }


    private fun getModel(): Model {
        return Model()
    }

    override fun download(download: String) {

        Glide.with(ivPic).load(download).into(ivPic)
    }
}