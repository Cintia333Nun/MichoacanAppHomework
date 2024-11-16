package com.example.michoacanapp.models

data class Place (
    val name: String,
    val photos: List<Int>,
    val restaurants: List<Item>,
    val hotels: List<Item>,
    val moreData: String,
) {
    data class Item(
        val title: String,
        val text: String,
        val rate: Float
    )
}