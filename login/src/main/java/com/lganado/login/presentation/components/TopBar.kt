package com.lganado.login.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.lganado.common.Day1Colors

@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .size(40.dp)
                .background(Color(Day1Colors.LightGrey), CircleShape)
        ) {
//            Icon(
//                Icons.AutoMirrored.Filled.ArrowBack,
//                contentDescription = "Back",
//                tint = Color(Day1Colors.TextMain)
//            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .background(Color(Day1Colors.VibrantYellow), RoundedCornerShape(8.dp))
                    .padding(6.dp)
            ) {
//                Icon(
//                    Icons.Default.AccountBalanceWallet,
//                    contentDescription = null,
//                    tint = Color(Day1Colors.NavyBlue)
//                )
            }
            Spacer(Modifier.width(8.dp))
            Text(
                text = "DAY1TRANSFER",
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Italic,
                color = Color(Day1Colors.NavyBlue)
            )
        }

        Spacer(Modifier.size(40.dp))
    }
}
