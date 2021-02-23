package com.example.countrylistviamvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.countrylistviamvvmkotlin.ViewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    private var position:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        getData()
        val viewModel= ViewModelProviders.of(this).get(MyViewModel::class.java)
        viewModel.observeResult().observe(this, Observer {
            val value:String=it!!
            tvText.text=value
        })
        if (position==0){
            viewModel.india()
        }else if(position==1){
            viewModel.pakistan()
        }else if(position==2) {
            viewModel.china()
        }else if(position==3){
            viewModel.america()
        }

    }
    private fun getData() {
        if (intent !=null){
            position=intent.getIntExtra("position",0)
        }
    }
}