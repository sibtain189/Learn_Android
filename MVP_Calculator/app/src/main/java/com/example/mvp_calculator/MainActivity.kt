package com.example.mvp_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),CalculateInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter=CalculatePresenter(getCalCulateDataModel(), this)
        btnCalculate.setOnClickListener {

            val firstValue=etFirst.text.toString().toDouble()
            val secondValue=etSecond.text.toString().toDouble()
            val calculate=etCalculate.text.toString()
            presenter.calculatorOf(firstValue,secondValue,calculate)

        }
    }

    private fun getCalCulateDataModel(): CalculatorModel {
        return CalculatorModel()

    }

    override fun result(resultOf: Double) {
        tvCalculate.text=resultOf.toString()
    }
}