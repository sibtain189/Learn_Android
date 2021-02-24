package com.example.mysqldatabase

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHandler(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        val DB_NAME = "tasks"
        val DB_VERSION = 1

        val TABLE_NAME = "taks"
        val ID = "id"
        val TITLE = "title"
        val DESC = "desk"

    }

    override fun onCreate(db: SQLiteDatabase?) {

        val CREATE_TABLE_QUERY = "CREATE TABLE $TABLE_NAME" +
                "($ID INTEGER PRIMARY KEY," +
                "$TITLE TEXT, " +
                "$DESC TEXT)"

        db?.execSQL(CREATE_TABLE_QUERY)

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }


    fun addTask(task: TaskModel): Boolean {
        val db = writableDatabase
        val values = ContentValues()

        values.put(TITLE, task.title)
        values.put(DESC, task.desc)

        val key = db.insert(TABLE_NAME, null, values)
        db.close()
        return (key.toInt() != -1)
    }


    fun getTasks(): MutableList<TaskModel> {
        val taskList = mutableListOf<TaskModel>()
        val db = readableDatabase
        val selectQuery = "select * from $TABLE_NAME"

        val cursor = db.rawQuery(selectQuery, null)

        if (cursor != null) {
            cursor.moveToFirst()
            do {
                val title = cursor.getString(cursor.getColumnIndex(TITLE))
                val id = cursor.getString(cursor.getColumnIndex(ID))
                val desc = cursor.getString(cursor.getColumnIndex(DESC))
                val newTask = TaskModel()
                newTask.id = id.toInt()
                newTask.title = title
                newTask.desc = desc
                taskList.add(newTask)

            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return taskList
    }

    fun editTask(task: TaskModel): Boolean {

        val db = writableDatabase
        val contentValue = ContentValues()
        contentValue.put(TITLE, task.title)
        contentValue.put(DESC, task.desc)
        val result = db.update(TABLE_NAME, contentValue, "id=${task.id}", null)
        return result != -1

    }

    fun deleteTask(task: TaskModel): Boolean {
        val db = writableDatabase
        val result = db.delete(TABLE_NAME, "id=${task.id}", null)
        return result != -1
    }

}