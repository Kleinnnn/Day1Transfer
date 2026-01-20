package com.lganado.day1transfer2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lganado.api.login.LoginRequest
import com.lganado.login_ui.screens.LoginScreen
import com.lganado.login_ui.viewmodels.LoginViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    val loginViewModel: LoginViewModel = hiltViewModel()


    NavHost(
        navController = navController,
        startDestination = "loginScreen"
    ) {
        composable("loginScreen") {
            LoginScreen(navController, LoginRequest("", ""), loginViewModel)
        }
    }

}
