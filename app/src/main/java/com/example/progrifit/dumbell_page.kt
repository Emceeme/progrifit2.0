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
         val biceps=findViewById<Button>(R.id.start_button)
        biceps.setOnClickListener {
            val intent=Intent(this@dumbell_page, bicep_curl::class.java)
            startActivity(intent)
        }
    }
}