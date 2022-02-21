package com.example.navigation_compose

import android.os.Bundle
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(navController: NavController, args: Bundle?){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){



        Text(
            modifier = Modifier.clickable {
                navController.popBackStack()
            },
            text = "${args?.getString("name")} ${args?.getInt("id")}",
            color = Color.Red,
            fontSize = MaterialTheme.typography.h1.fontSize,
            fontWeight = FontWeight.Bold)

    }
}

@Composable
@Preview(showBackground = true)
fun DetailPreview(){
    HomeScreen(
        navController = rememberNavController()
    )
}