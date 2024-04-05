package com.travelmobileapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Tworzymy obiekt Retrofit, który będzie służył do komunikacji z API
private val retrofit = Retrofit.Builder()
    // Ustawiamy bazowy URL dla żądań HTTP
    .baseUrl("https://restcountries.com/v3.1/region/")
    // Dodajemy konwerter fabryki Gson, który konwertuje odpowiedzi HTTP na obiekty Kotlin
    .addConverterFactory(GsonConverterFactory.create())
    // Budujemy obiekt Retrofit
    .build()


// Tworzymy interfejs ApiService, który zawiera metody do wykonywania zapytań HTTP do API
interface ApiService{
    // Oznaczamy metodę jako GET, określając endpoint (ścieżkę) do pobrania danych kategorii
    @GET("europe")
    // Metoda jest oznaczona jako suspend, co oznacza, że nie bedzie blokowac reszty programu
    suspend fun getCountries(): List<Country> //zwraca obiekt typu CategoriesResponse
}

// Tworzenie instancji interfejsu ApiService przy użyciu obiektu retrofit
// W ten sposób uzyskujemy gotowy do użycia serwis, który może wykonywać żądania HTTP do API
val countriesService: ApiService by lazy {
    retrofit.create(ApiService::class.java)
}