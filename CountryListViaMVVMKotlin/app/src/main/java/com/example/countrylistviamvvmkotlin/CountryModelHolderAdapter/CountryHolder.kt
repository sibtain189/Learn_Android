package com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.country_layout.view.*


class CountryHolder(private val view: View,private val clickListener: CountryClickListener):RecyclerView.ViewHolder(view) {
    fun setData(response: CountryModel){
             view.apply {
              tvCountryName.text=response.counrtyName
             }

        view.linearLayout.setOnClickListener(View.OnClickListener {
            if (clickListener != null) {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    clickListener.onClicked(position)
                }
            }
            if (clickListener!=null){
                val name=response.counrtyName
                if (name != null) {
                    clickListener.onClickName(name)
                }
            }

        })
    }
}