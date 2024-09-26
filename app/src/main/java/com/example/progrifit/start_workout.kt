package com.example.progrifit

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class start_workout : AppCompatActivity() {

        private lateinit var nextWorkoutButton: Button

        private var currentWorkoutIndex = 0

        private val workouts = listOf(
            Workout("Dumbell Curls", "4", "15", "45 seconds", R.drawable._5d92c6e_a92e_4e17_8491_a6d87ccd2db0_12),
            Workout("Lateral Raise", "4", "15", "45 seconds", R.drawable.dumbbell_lateral_raises),
            Workout("Shoulder Shrug", "4", "15", "45 seconds", R.drawable.dumbbell_shrug),
            Workout("Incline Bench press","4","15","45 seconds",R.drawable.incline_bench_press_1024x633),
            Workout("Cable Pull","4","15","45 seconds", R.drawable.cable_pullover_muscles_worked_750x562),
            Workout("Bench Press","4","15","45", R.drawable.bench_press_arch_benefits)


            // Add more workouts as needed
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_workout)

        nextWorkoutButton = findViewById(R.id.nexwork_btn)

        updateWorkoutDisplay()

        nextWorkoutButton.setOnClickListener {
            currentWorkoutIndex = (currentWorkoutIndex + 1) % workouts.size
            updateWorkoutDisplay()
        }
    }

        private fun updateWorkoutDisplay() {
            val workout = workouts[currentWorkoutIndex]

            // Update workout name and image
            findViewById<TextView>(R.id.workoutNameTextView1).text = workout.name
            findViewById<ImageView>(R.id.imageView1).setImageResource(workout.imageResId)
            findViewById<TextView>(R.id.setsTextView1).text = workout.sets
            findViewById<TextView>(R.id.repsTextView1).text = workout.reps
            findViewById<TextView>(R.id.restTextView1).text = workout.rest

            // If you want to update more workouts, add checks for index
        }

        data class Workout(val name: String, val sets: String, val reps: String, val rest: String, val imageResId: Int)
    }
