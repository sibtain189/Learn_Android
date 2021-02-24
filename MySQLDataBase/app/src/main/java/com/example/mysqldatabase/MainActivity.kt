package com.example.mysqldatabase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: DatabaseAdapter

    // var tasks= mutableListOf<String>()
    var tasks: MutableList<String> = mutableListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dbHandler = DataBaseHandler(this)



        btnAddTask.setOnClickListener {

            val newTask = TaskModel()

            newTask.title = etTaskTitle.text.toString()
            newTask.desc = etTaskDescription.text.toString()

            val result = dbHandler.addTask(newTask)

            if (result) {
                Toast.makeText(this, "Task Added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "failed to add task", Toast.LENGTH_SHORT).show()
            }


            val taskList = dbHandler.getTasks()
            tasks.addAll(taskList)
            adapter.notifyDataSetChanged()



        }
        setRecycler()
    }

    private fun setRecycler() {
        adapter = DatabaseAdapter(tasks as ArrayList<String>)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}