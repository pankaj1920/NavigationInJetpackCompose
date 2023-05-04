package com.example.navigationinjetpackcompose.Stevdza_San.screen

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
import com.example.navigationinjetpackcompose.Stevdza_San.navigation.ScreenRoute

@Composable
fun StevdzaSignUpScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            modifier = Modifier.clickable {
//                navController.navigate(ScreenRoute.DetailScreen.route)
//                navController.navigate("detail_screen/1")
//                navController.navigate(ScreenRoute.DetailScreen.passNameAndId(50,"Pankaj"))

                //optional argument
//                navController.navigate(ScreenRoute.DetailScreen.passId())
                navController.navigate(ScreenRoute.DetailScreen.passNameAndId())
            },
            text = "SignUp",
            color = Color.Green,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SignUpScreenPreview() {
    StevdzaSignUpScreen(rememberNavController())
}