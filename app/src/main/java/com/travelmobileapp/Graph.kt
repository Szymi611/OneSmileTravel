package com.travelmobileapp

import android.content.Context
import androidx.room.Room
import com.travelmobileapp.data.TravelDatabase
import com.travelmobileapp.data.TravelRepository

object Graph {
    lateinit var database: TravelDatabase

    val travelRepository by lazy{
        TravelRepository(travelDao = database.travelDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, TravelDatabase::class.java, "travelList.db").build()
    }

}
