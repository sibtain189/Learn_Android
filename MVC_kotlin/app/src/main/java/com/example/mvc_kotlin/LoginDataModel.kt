package com.example.mvc_kotlin

class LoginDataModel {
    fun validateUser(name: String, password: String):Boolean {
        return (name.equals("sibtain") && password.equals("12345"))
    }
}