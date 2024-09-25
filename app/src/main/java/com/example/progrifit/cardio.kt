package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cardio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cardio)

        val jogging_btn = findViewById<Button>(R.id.select_btn)
        jogging_btn.setOnClickListener {
            val intent = Intent(this@cardio, Start_jogging::class.java)
            startActivity(intent)
        }
    }
}