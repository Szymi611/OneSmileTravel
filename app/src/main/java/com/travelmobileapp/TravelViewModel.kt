package com.travelmobileapp


import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.travelmobileapp.data.Travel
import com.travelmobileapp.data.TravelRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TravelViewModel(
    private val travelRepository: TravelRepository = Graph.travelRepository
):ViewModel() {

    var travelTitleState by mutableStateOf("")
    var travelDescriptionState by mutableStateOf("")


    fun onTravelTitleChanged(newString:String){
        travelTitleState = newString
    }

    fun onTravelDescriptionChanged(newString: String){
        travelDescriptionState = newString
    }

    lateinit var getAllTravels: Flow<List<Travel>>

    init {
        viewModelScope.launch {
            getAllTravels = travelRepository.getTravels()
        }
    }

    fun addTravel(travel: Travel){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.addATravel(travel= travel)
        }
    }

    fun getATravelById(id:Long):Flow<Travel> {
        return travelRepository.getATravelById(id)
    }

    fun updateTravel(travel: Travel){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.updateATravel(travel= travel)
        }
    }

    fun deleteTravel(travel: Travel){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.deleteATravel(travel= travel)
            getAllTravels = travelRepository.getTravels()
        }
    }

    private val _countriesState = mutableStateOf(CountriesState())
    val countriesState: State<CountriesState> = _countriesState //umożliwia odczyt i reagowanie na zmiany stanu

    init {
        fetchingCountries()
    }

    private fun fetchingCountries(){
        viewModelScope.launch {//uruchamia asynchroniczne zadanie
            try {
                val response = countriesService.getCountries()
                _countriesState.value = _countriesState.value.copy( //uzywamy copy aby zmienic tylko te pola które chcemy zmienic a całą resztę pozostawić bez zmian
                    loading = false,
                    list = response,
                    error = null
                )
            } catch (e: Exception) {
                _countriesState.value = _countriesState.value.copy(
                    loading = false,
                    error = "Error fetching categories: ${e.message}"
                )
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
                Log.e("MainViewModel", "Error fetching categories: ${e.message}")
            }
        }
    }


    data class CountriesState(
        val loading: Boolean = true,
        val list: List<Country> = emptyList(),
        val error: String? = null
    )



}