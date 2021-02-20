package com.example.mvp_calculator

class CalculatorModel {
    fun calculate(firstWord: Double, secondWord: Double, calculate: String): Double {
        if (calculate.equals("+")) {
            return firstWord + secondWord
        } else if (calculate.equals("-")) {
            return secondWord - firstWord
        } else if (calculate.equals("*")) {
            return firstWord * secondWord
        } else {
            return firstWord / secondWord
        }
    }
}