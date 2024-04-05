package com.travelmobileapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class TravelDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun addATravel(travelEntity: Travel)

    // Loads all travels from the travel table
    @Query("Select * from `travel-table`")
    abstract fun getAllTravels(): Flow<List<Travel>>

    @Update
    abstract suspend fun updateATravel(travelEntity: Travel)

    @Delete
    abstract suspend fun deleteATravel(travelEntity: Travel)

    @Query("Select * from `travel-table` where id=:id")
    abstract fun getATravelById(id:Long): Flow<Travel>


}