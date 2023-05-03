package com.example.navigationinjetpackcompose.Stevdza_San.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationinjetpackcompose.Stevdza_San.navigation.ScreenRoute
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.HOME_ROUTE

@Composable
fun StevdzaLoginScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navController.navigate(ScreenRoute.SignUpScreen.route)
            },
            text = "Login",
            color = Color.Magenta,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(text = "Open Detail Screen", modifier = Modifier
            .padding(top = 150.dp)
            .clickable {
                navController.popBackStack()
                navController.navigate(ScreenRoute.DetailScreen.passNameAndId())
            },fontSize = MaterialTheme.typography.h6.fontSize,

            fontWeight = FontWeight.Medium)
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    StevdzaLoginScreen(rememberNavController())
}