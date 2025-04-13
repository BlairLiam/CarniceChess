package com.example.carnicechess

import android.os.Bundle
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val minutePicker: NumberPicker = findViewById(R.id.minutePicker)
        val secondPicker: NumberPicker = findViewById(R.id.secondPicker)

        // Set range for minutes (0–60)
        minutePicker.minValue = 0
        minutePicker.maxValue = 60

        // Set range for seconds (0–59)
        secondPicker.minValue = 0
        secondPicker.maxValue = 59

        // Optional: disable keyboard input, use only scroll
        minutePicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS
        secondPicker.descendantFocusability = NumberPicker.FOCUS_BLOCK_DESCENDANTS
    }
}