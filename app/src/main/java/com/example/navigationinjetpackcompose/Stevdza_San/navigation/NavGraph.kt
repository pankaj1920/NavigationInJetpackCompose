package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.AUTH_ROUTE
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.HOME_ROUTE
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.ROOT_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController,

    ) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {

        homeNavGraph(navController)
        authNavGraph(navController)
    }
}