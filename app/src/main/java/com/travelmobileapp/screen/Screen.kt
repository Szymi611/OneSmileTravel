package com.travelmobileapp.screen

import androidx.annotation.DrawableRes
import com.travelmobileapp.R

sealed class Screen(val route:String, val title: String, @DrawableRes val icon: Int) {
    object TravelsScreen: Screen("travels_screen", "Your travels", R.drawable.baseline_auto_stories_24)
    object AddScreen: Screen("add_screen", "Add travel", R.drawable.baseline_add_circle_outline_24)
    object CountriesScreen: Screen("countries_screen", "Map of your travels", R.drawable.baseline_map_24)

    object LoginScreen:Screen("loginscreen", "Log in" ,R.drawable.baseline_login_24)
    object SignupScreen:Screen("signupscreen", "Sign up", R.drawable.baseline_login_24)
    object ChatRoomsScreen:Screen("chatroomscreen", "Chat rooms", R.drawable.baseline_chat_24)
    object ChatScreen:Screen("chatscreen", "Chat screen", R.drawable.baseline_chat_24)
}