package com.example.carnicechess

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var gameHistoryList: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize your data list
        gameHistoryList = listOf(
            "Victory - 04/12/2025",
            "Defeat - 04/11/2025",
            "Draw - 04/10/2025"
        )

        // Find the ListView from the layout
        val listView = findViewById<android.widget.ListView>(R.id.listView_gameHistory)
        // Set up the custom adapter
        val adapter = CustomAdapter(this, gameHistoryList)
        listView.adapter = adapter
    }
}