package com.travelmobileapp.data

class CountryRepository(private val countryDao: CountryDao) {
    suspend fun getAllCountries(): List<CountryEntity> = countryDao.getAllCountries()

    suspend fun insertAll(countries: List<CountryEntity>) = countryDao.insertAll(countries)

    suspend fun updateVisitedStatus(countryId: String, visited: Boolean) =
        countryDao.updateVisitedStatus(countryId, visited)
}