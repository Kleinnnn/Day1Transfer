package com.lganado.day1transfer2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lganado.api.login.LoginRequest
import com.lganado.login.presentation.screens.LoginScreen
import com.lganado.login.presentation.viewmodels.LoginViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AppNavigation() {

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = "loginScreen"
    ) {
        composable("loginScreen") {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginScreen(navController, LoginRequest("", ""), loginViewModel)
        }
    }

}
