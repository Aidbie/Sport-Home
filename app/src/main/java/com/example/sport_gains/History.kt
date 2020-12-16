package com.example.sport_gains

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class History(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    val type: String?,
    val intensity: String?,
    val date:String?

)