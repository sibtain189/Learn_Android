package com.example.mysqldatabase

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnRowItemClicked {

    lateinit var adapter: DatabaseAdapter
    val dbHandler= DataBaseHandler(this)

    var tasks = mutableListOf<TaskModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
        adapter = DatabaseAdapter(tasks as ArrayList<TaskModel>,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onEditButtonClicked(task: TaskModel) {

        task.title = "new - title "
        task.desc = "new desc"
        dbHandler.editTask(task)

        val newTask = dbHandler.getTasks()
        tasks.clear()
        tasks.addAll(newTask)
        adapter.notifyDataSetChanged()

    }

    override fun onDeleteButtonClicked(task: TaskModel) {
dbHandler.deleteTask(task)
        val newTask=dbHandler.getTasks()
        tasks.clear()
        tasks.addAll(newTask)
        adapter.notifyDataSetChanged()
    }
}


