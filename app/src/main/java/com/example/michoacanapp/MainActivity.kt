package com.example.michoacanapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.michoacanapp.data_source.getDataPlaces
import com.example.michoacanapp.models.Place
import com.example.michoacanapp.view.ItemsScreen
import com.example.michoacanapp.view.MenuScreen
import com.example.michoacanapp.view.MoreScreen
import com.example.michoacanapp.view.PlacesScreen
import com.example.michoacanapp.view.SplashScreen
import com.example.michoacanapp.view.theme.MichoacanAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MichoacanAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    AppWithoutNavigation()
                }
            }
        }
    }
}

enum class NavigationStatus{ SPLASH, PLACES, MORE, MENU, HOTELS, RESTAURANTS }

@SuppressLint("MutableCollectionMutableState")
@Composable
fun AppWithoutNavigation() {
    val context = LocalContext.current
    BackHandler(enabled = true) {
        Toast.makeText(context, "Retroceso deshabilitado", Toast.LENGTH_SHORT).show()
    }

    var currentScreen by remember { mutableStateOf(NavigationStatus.SPLASH) }
    var selectedCountry by remember { mutableStateOf(getDataPlaces()[0]) }
    var more by remember { mutableStateOf("") }
    val items by remember { mutableStateOf(mutableListOf<Place.Item>()) }

    when (currentScreen) {
        NavigationStatus.SPLASH -> SplashScreen(onNavigate = { currentScreen = NavigationStatus.PLACES })
        NavigationStatus.PLACES -> PlacesScreen(onNavigate = { name ->
            selectedCountry = name
            currentScreen = NavigationStatus.MENU
        })
        NavigationStatus.MENU -> MenuScreen(
            selectedCountry = selectedCountry,
            currentScreen = { currentScreen = NavigationStatus.PLACES },
            onNavigateMore = { text ->
                more = text
                currentScreen = NavigationStatus.MORE
         },
            onNavigateRestaurants = { newItems ->
                currentScreen = NavigationStatus.RESTAURANTS
                items.clear()
                items.addAll(newItems)
            },
            onNavigateHotels = { newItems ->
                currentScreen = NavigationStatus.HOTELS
                items.clear()
                items.addAll(newItems)
           },
        )
        NavigationStatus.MORE -> MoreScreen(
            more = more,
            onNavigate = { currentScreen = NavigationStatus.MENU }
        )
        NavigationStatus.HOTELS -> ItemsScreen(
            title = "Hoteles",
            onNavigate = { currentScreen = NavigationStatus.MENU },
            listItems = items
        )
        NavigationStatus.RESTAURANTS -> ItemsScreen(
            title = "Restaurantes",
            onNavigate = { currentScreen = NavigationStatus.MENU },
            listItems = items
        )
    }
}

