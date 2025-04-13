package com.example.carnicechess

data class GameHistory(
    val result: String,
    val date: String
) {
    // You can create a custom property to display full details if needed.
    val displayText: String
        get() = "$result on $date"
}