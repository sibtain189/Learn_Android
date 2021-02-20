package com.example.mvvm_livedata.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvm_livedata.R
import com.example.mvvm_livedata.viewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        viewModel.observeResult().observe(this, Observer {

            val value = it!!
            tvResult.text = value

        })


        btnAdd.setOnClickListener {
            val number1 = etNumberOne.text.toString().toInt()
            val number2 = etNumberTwo.text.toString().toInt()
            viewModel.addNumbers(number1, number2)

        }

        btnSubs.setOnClickListener {

            val number1 = etNumberOne.text.toString().toInt()
            val number2 = etNumberTwo.text.toString().toInt()
            viewModel.substractNumbers(number1, number2)
        }

        btnMultiply.setOnClickListener {
            val number1 = etNumberOne.text.toString().toInt()
            val number2 = etNumberTwo.text.toString().toInt()
            viewModel.MultipleNumbers(number1, number2)

        }
    }
}