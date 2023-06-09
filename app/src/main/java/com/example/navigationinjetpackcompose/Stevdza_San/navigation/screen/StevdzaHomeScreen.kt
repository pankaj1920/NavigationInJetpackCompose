package com.example.navigationinjetpackcompose.Stevdza_San.navigation.screen

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigationinjetpackcompose.Stevdza_San.navigation.ScreenRoute
import com.example.navigationinjetpackcompose.Stevdza_San.utils.Constant.AUTH_ROUTE

@Composable
fun StevdzaHomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
//                navController.navigate(ScreenRoute.DetailScreen.route)
//                navController.navigate("detail_screen/1")
//                navController.navigate(ScreenRoute.DetailScreen.passNameAndId(50,"Pankaj"))

                //optional argument
//                navController.navigate(ScreenRoute.DetailScreen.passId())
                navController.navigate(ScreenRoute.DetailScreen.passNameAndId())
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Login/SignUp", modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.navigate(AUTH_ROUTE)
                }, fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    StevdzaHomeScreen(rememberNavController())
}