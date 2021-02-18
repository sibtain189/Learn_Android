package com.example.mvc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , LoginInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter=LoginPresenter(getLoginDataModel(),this)
        val userName=etUserName.text.toString()
        val password=etPassword.text.toString()
        btnLogin.setOnClickListener {

            presenter.login(userName,password)

        }
    }

    private fun getLoginDataModel(): LoginDataModel {
        return getLoginDataModel()

    }

    override fun success(message: String) {
        tvText.text=message
    }

    override fun failed(message: String) {
        tvText.text=message
    }
}