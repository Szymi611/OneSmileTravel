package com.travelmobileapp

import android.content.Context
import androidx.room.Room
import com.travelmobileapp.data.AppDatabase
import com.travelmobileapp.data.CountryRepository
import com.travelmobileapp.data.TravelRepository

object Graph {
    // Declare a single database instance. Make sure that AppDatabase includes all required DAOs.
    private lateinit var database: AppDatabase

    // Assuming TravelDao is part of AppDatabase
    val travelRepository by lazy {
        TravelRepository(travelDao = database.travelDao())
    }

    val countryRepository by lazy {
        CountryRepository(countryDao = database.countryDao())
    }

    fun provide(context: Context) {
        if (!::database.isInitialized) {
            database = Room.databaseBuilder(context, AppDatabase::class.java, "travelList.db")
                .fallbackToDestructiveMigration() // Use proper migration strategy in production
                .build()
        }
    }
}