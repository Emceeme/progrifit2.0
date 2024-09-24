package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bicep_curl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bicep_curl)

        val information=findViewById<Button>(R.id.lateral)
        information.setOnClickListener {
            val intent= Intent(this@bicep_curl, lateral::class.java)
            startActivity(intent)
        }
    }
}