package com.example.michoacanapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.michoacanapp.R
import com.example.michoacanapp.models.Place
import com.example.michoacanapp.view.components.ViewPagerWithCircles
import com.example.michoacanapp.view.theme.background
import com.example.michoacanapp.view.theme.primary
import com.example.michoacanapp.view.theme.secondary

@Composable
fun MenuScreen(
    selectedCountry: Place, onNavigateMore: (String) -> Unit,
    currentScreen: () -> Unit,
    onNavigateRestaurants: (List<Place.Item>) -> Unit, onNavigateHotels: (List<Place.Item>) -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .background(background)
            .padding(vertical = 40.dp, horizontal = 20.dp),
    ) {
        IconButton(
            onClick = { currentScreen() }
        ) {
            Icon(
                modifier = Modifier
                    .size(100.dp)
                    .clickable { currentScreen() },
                imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                contentDescription = "Atras",
                tint = primary
            )
        }
        Image(
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(width = 230.dp, height = 108.dp)
                .align(Alignment.End),
            painter = painterResource(R.drawable.logo), contentDescription = "logo"
        )
        ViewPagerWithCircles(
            selectedCountry.photos,
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 450.dp)
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 6.dp),
            textAlign = TextAlign.Center,
            text = selectedCountry.name,
            fontSize = 36.sp
        )
        Spacer(modifier = Modifier.weight(.6f))
        val colorButton = ButtonColors(
            contentColor = background,
            disabledContentColor = background,
            containerColor = primary,
            disabledContainerColor = secondary
        )
        Row {
            Button(
                modifier = Modifier
                    .weight(1.2f)
                    .padding(4.dp),
                onClick = { onNavigateRestaurants(selectedCountry.restaurants)},
                shape = ButtonDefaults.filledTonalShape,
                colors = colorButton
            ) {
                Text(
                    text = stringResource(R.string.restaurants),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Button(
                modifier = Modifier
                    .weight(.9f)
                    .padding(4.dp),
                onClick = { onNavigateHotels(selectedCountry.hotels)},
                shape = ButtonDefaults.outlinedShape,
                colors = colorButton
            ) {
                Text(
                    text = stringResource(R.string.hotels),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Button(
                onClick = { onNavigateMore(selectedCountry.moreData) },
                shape = ButtonDefaults.filledTonalShape,
                modifier = Modifier
                    .weight(.9f)
                    .padding(4.dp),
                colors = colorButton
            ) {
                Text(
                    text = stringResource(R.string.more),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}
