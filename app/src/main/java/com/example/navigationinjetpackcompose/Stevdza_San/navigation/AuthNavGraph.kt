package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaLoginScreen
import com.example.navigationinjetpackcompose.Stevdza_San.screen.StevdzaSignUpScreen
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.AUTH_ROUTE

fun NavGraphBuilder.authNavGraph(navController: NavController) {
    navigation(startDestination = ScreenRoute.LoginScreen.route, route = AUTH_ROUTE) {
        composable(ScreenRoute.LoginScreen.route) {
            StevdzaLoginScreen(navController)
        }
        composable(ScreenRoute.SignUpScreen.route) {
            StevdzaSignUpScreen(navController)
        }
    }
}

