package com.lganado.login_ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.lganado.common.Day1Colors

@Composable
fun SignInButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(Day1Colors.NavyBlue)
        )
    ) {
        Text("Sign In", fontWeight = FontWeight.Bold)
        Spacer(Modifier.width(8.dp))
//        Icon(Icons.Default.Bolt, contentDescription = null, tint = Day1Colors.VibrantYellow)
    }
}
