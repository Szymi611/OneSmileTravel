package com.travelmobileapp


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.travelmobileapp.data.CountryEntity
import com.travelmobileapp.data.CountryRepository
import com.travelmobileapp.data.Travel
import com.travelmobileapp.data.TravelRepository
import com.travelmobileapp.data.toCountry
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TravelViewModel(
    private val travelRepository: TravelRepository = Graph.travelRepository,
    private val countryRepository: CountryRepository = Graph.countryRepository
) : ViewModel() {

    var travelTitleState by mutableStateOf("")
    var travelDescriptionState by mutableStateOf("")

    private val _countriesState = mutableStateOf(CountriesState())
    val countriesState: State<CountriesState> = _countriesState

    data class CountriesState(
        val loading: Boolean = true,
        val list: List<Country> = emptyList(),
        val error: String? = null
    )


    fun onTravelTitleChanged(newString: String) {
        travelTitleState = newString
    }

    fun onTravelDescriptionChanged(newString: String) {
        travelDescriptionState = newString
    }

    //lateinit var getAllTravels: Flow<List<Travel>>
    val getAllTravels: Flow<List<Travel>> = travelRepository.getTravels().stateIn(
        scope = viewModelScope,
        started = WhileSubscribed(5000),
        initialValue = emptyList()
    )

    init {
        //fetchTravels()
        fetchCountries()
    }

//    fun fetchTravels() {
//        viewModelScope.launch {
//            getAllTravels = travelRepository.getTravels()
//        }
//    }

    fun addTravel(travel: Travel) {
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.addATravel(travel = travel)
        }
    }

    fun getATravelById(id: Long): Flow<Travel> {
        return travelRepository.getATravelById(id)
    }

    fun updateTravel(travel: Travel) {
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.updateATravel(travel = travel)
        }
    }

//        fun deleteTravel(travel: Travel) {
//            viewModelScope.launch(Dispatchers.IO) {
//                travelRepository.deleteATravel(travel = travel)
//                getAllTravels = travelRepository.getTravels()
//            }
//        }

    fun updateCountryVisitedStatus(countryId: String, visited: Boolean) {
        viewModelScope.launch(Dispatchers.IO) { // Switch to IO dispatcher for database operations
            countryRepository.updateVisitedStatus(countryId, visited)
            // Since fetchCountries may update the UI state, switch back to the main thread if there are UI updates.
            fetchCountries()
        }
    }


    private fun fetchCountries() {
        viewModelScope.launch(Dispatchers.IO) {
            val localCountries = countryRepository.getAllCountries()
            if (localCountries.isEmpty()) {
                try {
                    val apiCountries = countriesService.getCountries()
                    val countryEntities = apiCountries.map { apiCountry ->
                        // Assuming apiCountry is of type CountryEntity or has the same structure.
                        CountryEntity(
                            id = apiCountry.cca2,
                            name = apiCountry.name.commonName,
                            visited = false
                        )
                    }
                    countryRepository.insertAll(countryEntities)
                    // Update the state on the main thread since this affects the UI.
                    withContext(Dispatchers.Main) {
                        _countriesState.value = CountriesState(
                            loading = false,
                            list = countryEntities.map { it.toCountry() }, // Make sure this is not causing the issue.
                            error = null
                        )
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        _countriesState.value = CountriesState(
                            loading = false,
                            error = "Error fetching countries: ${e.message}"
                        )
                    }
                    Log.e("TravelViewModel", "Error fetching countries: ${e.message}")
                }
            } else {
                withContext(Dispatchers.Main) {
                    _countriesState.value = CountriesState(
                        loading = false,
                        list = localCountries.map { it.toCountry() }, // And here as well.
                        error = null
                    )
                }
            }
        }
    }

}