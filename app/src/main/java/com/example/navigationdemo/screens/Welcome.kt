package com.example.navigationdemo.screens

import com.example.navigationdemo.ProfileScreen
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavKey

@Composable
fun Welcome(
    onNavigation: (NavKey) -> Unit,
    name: String = ""
) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                "Welcome $name",
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.size(30.dp))

            Button(
                onClick = {
                    onNavigation(ProfileScreen)
                }
            ) {
                Text(text = "Set up your Profile")
            }
        }
    }
}