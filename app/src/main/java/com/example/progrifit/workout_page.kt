package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class workout_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_workout_page)

        val Cardio=findViewById<Button>(R.id.cardio_btn)
        Cardio.setOnClickListener {
            val intent= Intent(this@workout_page,cardio::class.java)
            startActivity(intent)
        }
        val muscle=findViewById<Button>(R.id.muscle_gain_btn)
        muscle.setOnClickListener {
            val intent= Intent(this@workout_page,dumbell_page::class.java)
            startActivity(intent)
        }
        val Core=findViewById<Button>(R.id.core_training_btn)
        Core.setOnClickListener {
            val intent= Intent(this@workout_page,core_page::class.java)
            startActivity(intent)
        }
    }
}