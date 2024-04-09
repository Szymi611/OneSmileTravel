package com.travelmobileapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CountryDao {
    @Query("SELECT * FROM CountryEntity")
    suspend fun getAllCountries(): List<CountryEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(countries: List<CountryEntity>)

    @Query("UPDATE CountryEntity SET visited = :visited WHERE id = :countryId")
    suspend fun updateVisitedStatus(countryId: String, visited: Boolean)
}