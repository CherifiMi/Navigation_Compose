package com.example.navigation_compose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screens.Home.route){
        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.Detail.route,
                    arguments =
                    listOf(
                        navArgument("id"){
                        type = NavType.IntType
                    },
                    navArgument("name"){
                        type = NavType.StringType
                    })
        )
        {
            Log.d("ARGSTEST", it.arguments?.getInt("id").toString())
            Log.d("ARGSTEST", it.arguments?.getString("name").toString())
            var args = it.arguments
            DetailScreen(navController, args)
        }
    }
}