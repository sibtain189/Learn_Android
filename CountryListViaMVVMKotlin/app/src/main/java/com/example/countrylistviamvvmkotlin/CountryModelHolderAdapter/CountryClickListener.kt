package com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter

interface CountryClickListener {
    fun onClicked(position:Int)
    fun onClickName(countryName:String)
}