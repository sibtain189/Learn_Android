package com.example.mysqldatabase

interface OnRowItemClicked {

    fun onEditButtonClicked(task:TaskModel)
    fun onDeleteButtonClicked(task: TaskModel)
}