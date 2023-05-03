package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaDetailScreen
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaHomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,

    ) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.HomeScreen.route
    ) {
        composable(ScreenRoute.HomeScreen.route) {
            StevdzaHomeScreen(navController)
        }

        composable(ScreenRoute.DetailScreen.route) {
            StevdzaDetailScreen(navController)
        }
    }
}