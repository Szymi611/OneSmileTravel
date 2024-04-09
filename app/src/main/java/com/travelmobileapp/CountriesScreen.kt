package com.travelmobileapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CountriesScreen(viewModel: TravelViewModel) {
    val viewState = viewModel.countriesState.value
    Box(modifier = Modifier.fillMaxSize()) {
        when {
            viewState.loading -> CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))

            viewState.error != null -> Text(
                "Error: ${viewState.error}",
                color = Color.Red,
                modifier = Modifier.align(Alignment.Center)
            )

            else -> CountryScreen(countries = viewState.list, viewModel = viewModel)
        }
    }
}

@Composable
fun CountryScreen(countries: List<Country>, viewModel: TravelViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.app_background_color))
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.mapa), //pobranie thumbnail
            contentDescription = "Map of Europe",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f) //aspectRatio(1f) oznacza ze bedzie kwadratem
        )

        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
            items(countries) { country ->
                CountryView(country = country, viewModel = viewModel)
            }
        }
    }
}

@Composable
fun CountryView(country: Country, viewModel: TravelViewModel) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .clickable { viewModel.updateCountryVisitedStatus(country.cca2, !country.visited) }
            .background(if (country.visited) Color.Green else Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(country.flags.png),
            contentDescription = "Flag of ${country.name.commonName}",
            modifier = Modifier
                .aspectRatio(1f)
        )

        Text(
            text = country.name.commonName,
            color = Color.Black,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}
