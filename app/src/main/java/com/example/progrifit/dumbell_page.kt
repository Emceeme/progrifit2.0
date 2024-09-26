package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dumbell_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dumbell_page)
        val information=findViewById<Button>(R.id.Start_btn)
        information.setOnClickListener {
            val intent=Intent(this@dumbell_page, start_workout::class.java)
            startActivity(intent)
        }
    }
}