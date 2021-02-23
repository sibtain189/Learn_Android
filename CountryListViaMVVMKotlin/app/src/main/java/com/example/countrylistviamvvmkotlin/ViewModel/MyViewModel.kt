package com.example.countrylistviamvvmkotlin.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countrylistviamvvmkotlin.Repository.MyRepository

class MyViewModel : ViewModel() {
    val repo = MyRepository()
    var mutableLiveData= MutableLiveData<String>()
    fun observeResult(): LiveData<String> {
        return mutableLiveData
    }
    fun india(){
        val result:String=repo.india()
        mutableLiveData.value=result
    }
    fun pakistan(){
        val result:String=repo.pakistan()
        mutableLiveData.value=result
    }
    fun china(){
        val result:String=repo.china()
        mutableLiveData.value=result
    }
    fun america(){
        val result:String= repo.america()
        mutableLiveData.value=result
    }
}