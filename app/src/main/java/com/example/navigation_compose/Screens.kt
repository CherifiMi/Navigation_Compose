package com.example.navigation_compose

sealed class Screens(val route: String){
    object Home: Screens(route = "home_screen")
    object Detail: Screens(route = "detail_screen")
}
