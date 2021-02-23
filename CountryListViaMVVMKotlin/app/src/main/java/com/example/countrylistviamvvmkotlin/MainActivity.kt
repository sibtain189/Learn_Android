package com.example.countrylistviamvvmkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter.CountryAdapter
import com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter.CountryClickListener
import com.example.countrylistviamvvmkotlin.CountryModelHolderAdapter.CountryModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CountryClickListener {

    private lateinit var countryAdapter: CountryAdapter
    private var responseList:List<CountryModel> = listOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buildData()
        setAdapter()
    }
    private fun setAdapter() {

        countryAdapter= CountryAdapter(responseList, this)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=countryAdapter

    }

    private fun buildData() {

        val item=
            CountryModel(
                "India"
            )
        val item1=
            CountryModel(
                "Pakistan"
            )
        val item2=
            CountryModel(
                "China"
            )
        val item3 =
            CountryModel(
                "America"
            )
        val item4=
            CountryModel(
                "Nepal"
            )
        val item5=
            CountryModel(
                "Japan"
            )
        val item6=
            CountryModel(
                "Indonesia"
            )
        val item7=
            CountryModel(
                "Bhutan"
            )
        val item8=
            CountryModel(
                "London"
            )
        val item9=
            CountryModel(
                "Bangladesh"
            )
        responseList +=item
        responseList +=item1
        responseList +=item2
        responseList +=item3
        responseList +=item4
        responseList +=item5
        responseList +=item6
        responseList +=item7
        responseList +=item8
        responseList +=item9



    }

    override fun onClicked(position: Int) {
//        Toast.makeText(this, "Position $position", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("position", position)
        startActivity(intent)
    }

    override fun onClickName(countryName: String) {
        Toast.makeText(this, "$countryName", Toast.LENGTH_SHORT).show()

    }
}