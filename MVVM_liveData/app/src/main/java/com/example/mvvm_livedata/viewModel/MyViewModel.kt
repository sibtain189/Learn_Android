package com.example.mvvm_livedata.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm_livedata.repository.MyRepository

class MyViewModel : ViewModel() {

    val repository=MyRepository()
    val mutableLiveData=MutableLiveData<String>()

    fun observeResult():LiveData<String>{
        return mutableLiveData
    }

    fun addNumbers(number1:Int,number2:Int){
        val result=repository.addNumbers(number1,number2)
        mutableLiveData.value=result.toString()
    }

    fun substractNumbers(number1:Int,number2:Int){
        val result=repository.substractNumbers(number1,number2)
        mutableLiveData.value=result.toString()
    }

    fun MultipleNumbers(number1:Int,number2:Int){
        val result=repository.multiplyNumbers(number1,number2)
        mutableLiveData.value=result.toString()
    }
}