package com.kong.to_docompose.data.repository

import com.kong.to_docompose.data.TodoDao
import com.kong.to_docompose.data.TodoDatabase
import com.kong.to_docompose.data.models.TodoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val todoDao: TodoDao) {

    val getAllTasks :Flow<List<TodoTask>> = todoDao.getAllTasks()
    val sortByLowPriority:Flow<List<TodoTask>> = todoDao.sortByLowPriority()
    val sortByHighPriority:Flow<List<TodoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId:Int) :Flow<TodoTask> {
        return todoDao.getSelectedTask(taskId)
    }

    suspend fun addTask(toDoTask:TodoTask){
        todoDao.addTask(toDoTask)
    }

    suspend fun update(toDoTask: TodoTask){
        todoDao.updateTask(toDoTask)
    }

    suspend fun deleteTask(toDoTask: TodoTask){
        todoDao.deleteTask(toDoTask)
    }

    suspend fun deleteAllTask(){
        todoDao.deleteAllTask()
    }

    fun searchDatabase(searchQuery: String):Flow<List<TodoTask>>{
        return todoDao.searchDatabase((searchQuery))
    }
}