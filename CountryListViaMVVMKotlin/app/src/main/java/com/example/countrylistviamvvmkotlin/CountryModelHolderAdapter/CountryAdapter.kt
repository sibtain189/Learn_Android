package com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.countrylistviamvvmkotlin.R

class CountryAdapter(private val countryList:List<CountryModel>, private val clickListener: CountryClickListener):RecyclerView.Adapter<CountryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
   val view=LayoutInflater.from(parent.context).inflate(R.layout.country_layout,parent,false)
        return CountryHolder(view, clickListener)
    }

    override fun getItemCount(): Int {
       return countryList.size
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.setData(countryList.get(position))
    }
}