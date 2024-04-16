package com.travelmobileapp


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.navigation.*
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.travelmobileapp.screen.ChatRoomListScreen
import com.travelmobileapp.screen.ChatScreen
import com.travelmobileapp.screen.CountriesScreen
import com.travelmobileapp.screen.LoginScreen
import com.travelmobileapp.screen.Screen
import com.travelmobileapp.screen.SignUpScreen
import com.travelmobileapp.viewmodel.AuthViewModel

@Composable
fun MainScreen(viewModel: TravelViewModel = viewModel(),
               authViewModel: AuthViewModel = viewModel()) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        Navigation(viewModel = viewModel, navController = navController, authViewModel = authViewModel, paddingValues = it)
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        Screen.CountriesScreen,
        Screen.TravelsScreen,
        Screen.ChatRoomsScreen
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.app_bar_color)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = screen.icon), contentDescription = null) }, // Define your icon for each screen
                label = { Text(screen.title) }, // Define the title for each screen
                selected = currentRoute == screen.route,
                onClick = {
                    // This is where you handle navigation when a bottom bar item is clicked
                    navController.navigate(screen.route) {
                        // This will prevent multiple copies of the same destination when reselecting the same item
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        // Avoid multiple copies of the same destination to be on the stack
                        launchSingleTop = true
                        // Restore state when navigating back to a previously visited destination
                        restoreState = true
                    }
                }
            )
        }
    }
}


@Composable
fun Navigation(viewModel: TravelViewModel = viewModel(),
               navController: NavHostController = rememberNavController(),
               authViewModel: AuthViewModel,
               paddingValues: PaddingValues){
    NavHost(
        navController= navController,
        startDestination = Screen.LoginScreen.route,
        modifier = Modifier.padding(paddingValues)
    ){
        composable(Screen.TravelsScreen.route){
            HomeView(navController, viewModel)
        }

        composable(Screen.AddScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.LongType
                    defaultValue = 0L
                    nullable = false
                }
            )
        ){entry->
            val id = if(entry.arguments != null)  entry.arguments!!.getLong("id") else 0L
            AddEditDetailView(id = id, viewModel = viewModel , navController = navController)
        }

        composable(Screen.CountriesScreen.route) {
            CountriesScreen(viewModel = viewModel)
        }

        composable(Screen.SignupScreen.route) {
            SignUpScreen(
                authViewModel = authViewModel,
                onNavigateToLogin = { navController.navigate(Screen.LoginScreen.route) }
            )
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = { navController.navigate(Screen.SignupScreen.route) }
            ) {
                navController.navigate(Screen.TravelsScreen.route)
            }
        }
        composable(Screen.ChatRoomsScreen.route) {
            ChatRoomListScreen{
                navController.navigate("${Screen.ChatScreen.route}/$it.id")
            }
        }
        composable("${Screen.ChatScreen.route}/{roomId}") {
            val roomId: String = it
                .arguments?.getString("roomId") ?: ""
            ChatScreen(roomId = roomId)
        }
    }
}