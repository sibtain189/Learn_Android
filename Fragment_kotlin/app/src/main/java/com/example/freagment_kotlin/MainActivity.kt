package com.example.freagment_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

private lateinit var fragmentManager: FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager=supportFragmentManager
        initListener()

    }

    private fun initListener() {
        btnAnimal.setOnClickListener {
            val fragmentTransaction: FragmentTransaction=fragmentManager.beginTransaction()
           val animalFragment=AnimalFragment()
            fragmentTransaction.add(R.id.flContainer,animalFragment,"tag").addToBackStack(null).commit()
        }
    }
}