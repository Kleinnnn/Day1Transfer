package com.lganado.login_ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.lganado.api.login.LoginRequest
import com.lganado.api.login.LoginResponse
import com.lganado.common.Day1Colors
import com.lganado.login_ui.components.PasswordField
import com.lganado.login_ui.components.SignInButton
import com.lganado.login_ui.components.TopBar
import com.lganado.login_ui.viewmodels.LoginViewModel


@Composable
fun LoginScreen(navController: NavController, loginRequest: LoginRequest, loginViewModel: LoginViewModel) {
   val login by loginViewModel.response.collectAsState(initial = LoginResponse())

    var passwordVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Background accents
        Box(
            modifier = Modifier
                .size(260.dp)
                .offset(x = 160.dp, y = (-120).dp)
                .background(Color(Day1Colors.LightGrey), CircleShape)
                .alpha(0.5f)
        )

        Box(
            modifier = Modifier
                .size(320.dp)
                .offset(x = (-160).dp, y = 500.dp)
                .background(Color(Day1Colors.VibrantYellow).copy(alpha = 0.05f), CircleShape)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {

            Spacer(Modifier.height(16.dp))

            TopBar()

            Spacer(Modifier.height(24.dp))

//            LogoSection()

            Spacer(Modifier.height(32.dp))

            Spacer(Modifier.height(16.dp))

            PasswordField(
                password = loginRequest.password,
                isVisible = passwordVisible,
                onToggleVisibility = { passwordVisible = !passwordVisible },
                onValueChange = { loginRequest.password = it }
            )

            Spacer(Modifier.height(24.dp))

            SignInButton()

            Spacer(Modifier.height(32.dp))

            Spacer(Modifier.weight(1f))

//            Footer()
        }
    }

}
