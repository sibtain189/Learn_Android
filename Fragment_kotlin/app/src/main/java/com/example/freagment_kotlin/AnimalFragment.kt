package com.example.freagment_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_animal.*


class AnimalFragment : Fragment() {

    private lateinit var animalAdapter: AnimalAdapter
    private var animalList: List<Animal> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildRecyclerData()
        setRecyclerAdapetr()


    }

    private fun buildRecyclerData() {

        for (i in 0..9) {

            val item = Animal(
                "https://i.guim.co.uk/img/media/fe1e34da640c5c56ed16f76ce6f994fa9343d09d/0_174_3408_2046/master/3408.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=0d3f33fb6aa6e0154b7713a00454c83d",
                "dog"
            )
            val item2 = Animal(
                "https://img.webmd.com/dtmcms/live/webmd/consumer_assets/site_images/article_thumbnails/other/cat_relaxing_on_patio_other/1800x1200_cat_relaxing_on_patio_other.jpg?resize=750px:*",
                "cat"
            )

            animalList += item
            animalList += item2
        }


    }

    private fun setRecyclerAdapetr() {
        animalAdapter = AnimalAdapter(animalList)
        val linearLayout = LinearLayoutManager(context)
        recyclerView.apply {

            layoutManager = linearLayout
            adapter = animalAdapter

        }
    }
}