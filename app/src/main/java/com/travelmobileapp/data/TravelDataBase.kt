package com.travelmobileapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Travel::class],
    version = 1,
    exportSchema = false
)
abstract class TravelDatabase : RoomDatabase() {
    abstract fun travelDao(): TravelDao
}