package com.example.navigationinjetpackcompose.Stevdza_San.navigation

import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.DETAIL_ARGS_KEY

sealed class ScreenRoute(val route:String){
    object HomeScreen:ScreenRoute(route = "home_screen")
    object DetailScreen:ScreenRoute(route = "detail_screen/{$DETAIL_ARGS_KEY}"){
        fun passId(id:Int):String{
//            return "detail_screen/$id"
            return this.route.replace(oldValue = "{$DETAIL_ARGS_KEY}", newValue = id.toString())
        }
    }
}
