package com.example.mvp_calculator

class CalculatePresenter(val calculatorModel: CalculatorModel,val calculateInterface: CalculateInterface){

    fun calculatorOf(firstWord:Double,SecondWord:Double,calculate:String){
val final=calculatorModel.calculate(firstWord,SecondWord,calculate)
        calculateInterface.result(final)
    }
}


