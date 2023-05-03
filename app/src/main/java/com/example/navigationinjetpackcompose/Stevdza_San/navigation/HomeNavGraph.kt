package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaDetailScreen
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaHomeScreen
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.HOME_ROUTE


fun NavGraphBuilder.homeNavGraph(navController:NavController){

    navigation(startDestination = ScreenRoute.HomeScreen.route, route = HOME_ROUTE){
        composable(ScreenRoute.HomeScreen.route) {
            StevdzaHomeScreen(navController)
        }

        composable(ScreenRoute.DetailScreen.route,
            arguments = listOf(
                navArgument(Constant.DETAIL_ARGS_KEY) {
                    type = NavType.IntType
                    defaultValue = -1
                },
                navArgument(Constant.DETAIL_ARGS_KEY2) {
                    type = NavType.StringType
                    defaultValue = "pankaj"
                }
            )
        ) {
            Log.e("VAlue1", it.arguments?.getInt(Constant.DETAIL_ARGS_KEY).toString())
            Log.e("VAlue1", it.arguments?.getString(Constant.DETAIL_ARGS_KEY2).toString())
            StevdzaDetailScreen(navController)
        }
    }

}