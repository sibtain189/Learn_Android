package com.example.freagment_kotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private var animalList: List<Animal>) : RecyclerView.Adapter<AnimalHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.animal_item,parent,false)
        return AnimalHolder(view)
    }

    override fun getItemCount(): Int {
       return animalList.size
    }

    override fun onBindViewHolder(holder: AnimalHolder, position: Int) {
    val animal=animalList[position]
        holder.setData(animal)
    }
}