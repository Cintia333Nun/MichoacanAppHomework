package com.example.michoacanapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.michoacanapp.view.components.ScrollableTextDisplay
import com.example.michoacanapp.view.components.Toolbar

@Composable
fun MoreScreen(more: String, onNavigate: () -> Unit) {
    Column(
        Modifier.padding(vertical = 40.dp, horizontal = 20.dp),
    ) {
        Toolbar(
            title = "Más Información"
        ) { onNavigate() }
        ScrollableTextDisplay(more)
    }
}