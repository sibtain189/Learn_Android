package com.example.freagment_kotlin

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.animal_item.view.*

class AnimalHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun setData(animal: Animal) {

        view.apply {
            tvAnimal.text = animal.url
            Glide.with(ivAnimal).load(animal.image).into(ivAnimal)
        }
    }

}