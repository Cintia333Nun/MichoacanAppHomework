package com.example.michoacanapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.michoacanapp.models.Place
import com.example.michoacanapp.view.components.ItemCard
import com.example.michoacanapp.view.components.Toolbar

@Composable
fun ItemsScreen(title: String, listItems: List<Place.Item>, onNavigate: () -> Unit) {
    Column(
        Modifier.padding(vertical = 40.dp, horizontal = 20.dp),
    ) {
        Toolbar(
            title = title
        ) { onNavigate() }
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(listItems) { item -> ItemCard(item) }
        }
    }
}