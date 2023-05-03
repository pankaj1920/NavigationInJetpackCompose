package com.example.navigationinjetpackcompose.Stevdza_San.navigation

sealed class ScreenRoute(val route: String) {
    object HomeScreen : ScreenRoute(route = "home_screen")
    object LoginScreen : ScreenRoute(route = "login_screen")
    object SignUpScreen : ScreenRoute(route = "signup_screen")

    /*  //Passing Single and Muliple Required Argument
      object DetailScreen:ScreenRoute(route = "detail_screen/{$DETAIL_ARGS_KEY}/{$DETAIL_ARGS_KEY2}"){
          fun passId(id:Int):String{
  //            return "detail_screen/$id"
              return this.route.replace(oldValue = "{$DETAIL_ARGS_KEY}", newValue = id.toString())
          }
          fun passNameAndId(id:Int,name:String):String{
              return "detail_screen/$id/$name"
          }
      }*/

    //Passing Optional Argument for that we need to use ? instead of /
    object DetailScreen : ScreenRoute(route = "detail_screen?id={id}&name={name}") {
      /*  fun passId(id: Int = -1): String {
            return "detail_screen?id=$id"
        }
*/
        fun passNameAndId(id: Int = 0, name: String="pankaj"): String {
            return "detail_screen?id=$id&name=$name"
        }
    }
}
