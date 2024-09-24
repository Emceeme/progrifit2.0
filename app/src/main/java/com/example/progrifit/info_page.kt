package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class info_page : AppCompatActivity() {
    private lateinit var nameInput: EditText
    private lateinit var ageInput: EditText
    private lateinit var weightInput: EditText
    private lateinit var weightGoalInput: EditText
    private lateinit var dateTargetInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_info_page)

        // Initialize EditText fields
        nameInput = findViewById(R.id.name_input)
        ageInput = findViewById(R.id.age_input)
        weightInput = findViewById(R.id.weight_input)
        weightGoalInput = findViewById(R.id.weight_goal_input)
        dateTargetInput = findViewById(R.id.date_target_input)

        val informationButton = findViewById<Button>(R.id.work_out_btn)
        informationButton.setOnClickListener {
            // Retrieve user input
            val name = nameInput.text.toString()
            val age = ageInput.text.toString()
            val weight = weightInput.text.toString()
            val weightGoal = weightGoalInput.text.toString()
            val targetDate = dateTargetInput.text.toString()

            // Create intent to start workout_page
            val intent = Intent(this@info_page, workout_page::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_AGE", age)
                putExtra("EXTRA_WEIGHT", weight)
                putExtra("EXTRA_WEIGHT_GOAL", weightGoal)
                putExtra("EXTRA_TARGET_DATE", targetDate)
            }
            startActivity(intent)
        }
    }
}