package com.example.sport_gains

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(History::class), version = 1)
abstract class AppDatabase : RoomDatabase()
{
    abstract fun getHistoryDao() : HistoryDao

    companion object
    {
        private var instance : AppDatabase? = null

        fun getInstance(context: Context) : AppDatabase?
        {
            if(instance == null)
            {
                instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "database.db").build()
            }
            return instance
        }
    }
}