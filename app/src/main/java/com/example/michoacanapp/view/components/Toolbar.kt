package com.example.michoacanapp.view.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.michoacanapp.view.theme.primary

@Composable
fun Toolbar(title: String, event: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { event() }
        ) {
            Icon(
                modifier = Modifier
                    .size(100.dp)
                    .clickable { event() },
                imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                contentDescription = "Atras",
                tint = primary
            )
        }
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            textAlign = TextAlign.End,
            text = title,
            fontSize = 36.sp,
            color = primary,
        )
    }
}