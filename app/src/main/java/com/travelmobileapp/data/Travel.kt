package com.travelmobileapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="travel-table")
data class Travel(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="travel-title")
    val title: String="",
    @ColumnInfo(name="travel-description")
    val description:String=""
)
