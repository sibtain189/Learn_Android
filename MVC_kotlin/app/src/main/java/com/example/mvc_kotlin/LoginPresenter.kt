package com.example.mvc_kotlin

class LoginPresenter(val dataModel: LoginDataModel,val loginInterface: LoginInterface) {

    fun login(userName:String,password:String){
        val result=dataModel.validateUser(userName,password)
        if(result){
            loginInterface.success("user logged in")
        }
        else{
            loginInterface.failed("user login failed")
        }
    }

}