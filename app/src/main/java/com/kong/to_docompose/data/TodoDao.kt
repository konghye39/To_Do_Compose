package com.kong.to_docompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.kong.to_docompose.data.models.TodoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<TodoTask>>

    @Query("SELECT * FROM todo_table WHERE id=:taskId")
    fun getSelectedTask(taskId: Int): Flow<TodoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTask(toDoTask: TodoTask)

    @Update
    suspend fun updateTask(toDoTask: TodoTask)

    @Delete
    suspend fun deleteTask(todoTask: TodoTask)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTask()

    @Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE:searchQuery")
    fun searchDatabase(searchQuery:String):Flow<List<TodoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' then 1 when priority LIKE 'M%' then 2 when priority LIKE 'H%' then 3 END")
    fun sortByLowPriority():Flow<List<TodoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'H%' then 1 when priority LIKE 'M%' then 2 when priority LIKE 'L%' then 3 END")
    fun sortByHighPriority():Flow<List<TodoTask>>
}