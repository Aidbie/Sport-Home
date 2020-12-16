package com.example.sport_gains

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface HistoryDao
{
    @Insert
    fun insert(history:History): Completable

    @Delete
    fun delete(history:History): Completable

    @Query("SELECT * FROM history")
    fun getAllHistory() : Single<List<History>>



    @Query("SELECT * FROM history WHERE uid IN (:historyId)")
    fun getUserById(historyId:Int) :Single<History>


    //@Delete

}