package com.example.navigationinjetpackcompose.Stevdza_San.navigation

sealed class ScreenRoute(val route:String){
    object HomeScreen:ScreenRoute(route = "home_screen")
    object DetailScreen:ScreenRoute(route = "detail_screen")
}
