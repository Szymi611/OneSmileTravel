package com.travelmobileapp.data

import kotlinx.coroutines.flow.Flow


class TravelRepository(private val travelDao: TravelDao) {

    suspend fun addATravel(travel:Travel){
        travelDao.addATravel(travel)
    }

    fun getTravels(): Flow<List<Travel>> = travelDao.getAllTravels()

    fun getATravelById(id:Long) :Flow<Travel> {
        return travelDao.getATravelById(id)
    }

    suspend fun updateATravel(travel:Travel){
        travelDao.updateATravel(travel)
    }

    suspend fun deleteATravel(travel: Travel){
        travelDao.deleteATravel(travel)
    }

}