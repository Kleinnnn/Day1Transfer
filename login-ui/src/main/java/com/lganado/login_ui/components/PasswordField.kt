package com.lganado.login_ui.components

//import androidx.compose.material.icons.Icons
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lganado.common.Day1Colors

@Composable
fun PasswordField(
    password: String,
    isVisible: Boolean,
    onToggleVisibility: () -> Unit,
    onValueChange: (String) -> Unit
) {
    Column {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Password",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = Color(Day1Colors.NavyBlue)
            )
            Text(
                text = "Forgot?",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                color = Color(Day1Colors.TextMuted)
            )
        }

        Spacer(Modifier.height(6.dp))

        OutlinedTextField(
            value = password,
            onValueChange = onValueChange,
//            leadingIcon = {
//                Icon(Icons.Default.Lock, null, tint = Day1Colors.VibrantYellow)
//            },
//            trailingIcon = {
//                IconButton(onClick = onToggleVisibility) {
//                    Icon(
//                        if (isVisible) Icons.Default.VisibilityOff else Icons.Default.Visibility,
//                        contentDescription = null
//                    )
//                }
//            },
            visualTransformation = if (isVisible) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
//            colors = OutlinedTextFieldDefaults.colors(
//                unfocusedBorderColor = Day1Colors.BorderGrey,
//                focusedBorderColor = Day1Colors.VibrantYellow
//            )
        )
    }
}
