package com.example.michoacanapp.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.michoacanapp.data_source.getDataPlaces
import com.example.michoacanapp.models.Place
import com.example.michoacanapp.view.components.ItemPlace
import com.example.michoacanapp.view.theme.background
import com.example.michoacanapp.view.theme.primary

@Composable
fun PlacesScreen(onNavigate: (Place) -> Unit) {
    Column(
        Modifier.background(background)
            .padding(horizontal = 10.dp, vertical = 40.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            textAlign = TextAlign.Center,
            text = "Municipios",
            fontSize = 36.sp,
            color = primary
        )
        Spacer(modifier = Modifier.height(6.dp))
        LazyColumn(
            modifier = Modifier.weight(1F)
        ) {
            items(getDataPlaces()) { place ->
                ItemPlace(
                    modifier = Modifier.clickable { onNavigate(place) },
                    image = place.photos[0],
                    name = place.name
                )
            }
        }
    }
}