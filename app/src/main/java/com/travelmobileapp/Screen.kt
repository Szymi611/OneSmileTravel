package com.travelmobileapp

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route:String, val title: String, @DrawableRes val icon: Int) {
    object TravelsScreen: Screen("travels_screen", "Your travels", R.drawable.baseline_auto_stories_24)
    object AddScreen: Screen("add_screen", "Add travel", R.drawable.baseline_add_circle_outline_24)
    object CountriesScreen: Screen("countries_screen", "Map of your travels", R.drawable.baseline_map_24)
}