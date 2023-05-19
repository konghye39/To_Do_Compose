package com.kong.to_docompose.di

import android.content.Context
import androidx.room.Room
import com.kong.to_docompose.data.TodoDatabase
import com.kong.to_docompose.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    //Hilt가 이 함수를 사용해 Database 인스턴스를 제공하고 싱글톤으로 관리함을 나타냄
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        TodoDatabase::class.java,
        DATABASE_NAME
    ).build()

    //Hilt가 이 함수를 사용해 toDoDao의 인스턴스를 제공하고 싱글톤으로 관리함.
    @Singleton
    @Provides
    fun provideDao(database: TodoDatabase) = database.toDoDao()
}