package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigationinjetpackcompose.Stevdza_San.navigation.screen.StevdzaDetailScreen
import com.example.navigationinjetpackcompose.Stevdza_San.navigation.screen.StevdzaHomeScreen
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.DETAIL_ARGS_KEY

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

        composable(ScreenRoute.DetailScreen.route,
        arguments = listOf(navArgument(DETAIL_ARGS_KEY){
            type= NavType.IntType
        })
        ){
        Log.e("VAlue", it.arguments?.getInt(DETAIL_ARGS_KEY).toString())
            StevdzaDetailScreen(navController)
        }
    }
}