package com.example.navigation_compose

sealed class Screens(val route: String){
    object Home: Screens(route = "home_screen")
    object Detail: Screens(route = "detail_screen/{id}/{name}"){
        fun passId(id: Int): String{
            return "detail_screen/$id"
        }
        fun passIdName(id: Int, name: String): String{
            return "detail_screen/$id/$name"
        }
    }
}
