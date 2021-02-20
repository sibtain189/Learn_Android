package com.example.mvvm_livedata.repository

class MyRepository {

    fun addNumbers(operand1: Int, operand2: Int): Int {
        return operand1 + operand2;
    }


    fun substractNumbers(operand1: Int, operand2: Int): Int {
        return operand1 - operand2;
    }


    fun multiplyNumbers(operand1: Int, operand2: Int): Int {
        return operand1 * operand2;
    }

}