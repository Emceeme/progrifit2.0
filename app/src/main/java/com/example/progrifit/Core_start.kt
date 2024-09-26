package com.example.progrifit

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Core_start : AppCompatActivity() {
    private lateinit var nextWorkoutButton: Button
    private var currentWorkoutIndex = 0

    private val workouts = listOf(
        Workout("Push Up", "4", "10", "60 seconds", R.drawable.negative_push_up_step_2_1024x797),
        Workout("Sit Up", "3", "15", "30 seconds", R.drawable.janda_sit_up),
        Workout("Mountain Climb", "3", "20", "30 seconds", R.drawable.mountainclimbers),
        Workout("Sitting Crunch", "3", "15", "30 seconds", R.drawable.crunch_straight_leg_up),
        Workout("Plank", "3", "30 seconds", "30 seconds", R.drawable.plank_muscles_worked),
        Workout("Bicycle Crunch", "3", "15", "30 seconds", R.drawable.bicycle_exercise)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_workout)

        nextWorkoutButton = findViewById(R.id.nextworkout_btn)

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

        // Update the remaining workout views
        findViewById<TextView>(R.id.workoutNameTextView2).text = workouts[1].name
        findViewById<ImageView>(R.id.imageView2).setImageResource(workouts[1].imageResId)
        findViewById<TextView>(R.id.setsTextView2).text = workouts[1].sets
        findViewById<TextView>(R.id.repsTextView2).text = workouts[1].reps
        findViewById<TextView>(R.id.restTextView2).text = workouts[1].rest

        findViewById<TextView>(R.id.workoutNameTextView3).text = workouts[2].name
        findViewById<ImageView>(R.id.imageView3).setImageResource(workouts[2].imageResId)
        findViewById<TextView>(R.id.setsTextView3).text = workouts[2].sets
        findViewById<TextView>(R.id.repsTextView3).text = workouts[2].reps
        findViewById<TextView>(R.id.restTextView3).text = workouts[2].rest

        findViewById<TextView>(R.id.workoutNameTextView4).text = workouts[3].name
        findViewById<ImageView>(R.id.imageView4).setImageResource(workouts[3].imageResId)
        findViewById<TextView>(R.id.setsTextView4).text = workouts[3].sets
        findViewById<TextView>(R.id.repsTextView4).text = workouts[3].reps
        findViewById<TextView>(R.id.restTextView4).text = workouts[3].rest

        findViewById<TextView>(R.id.workoutNameTextView5).text = workouts[4].name
        findViewById<ImageView>(R.id.imageView5).setImageResource(workouts[4].imageResId)
        findViewById<TextView>(R.id.setsTextView5).text = workouts[4].sets
        findViewById<TextView>(R.id.repsTextView5).text = workouts[4].reps
        findViewById<TextView>(R.id.restTextView5).text = workouts[4].rest

        findViewById<TextView>(R.id.workoutNameTextView6).text = workouts[5].name
        findViewById<ImageView>(R.id.imageView6).setImageResource(workouts[5].imageResId)
        findViewById<TextView>(R.id.setsTextView6).text = workouts[5].sets
        findViewById<TextView>(R.id.repsTextView6).text = workouts[5].reps
        findViewById<TextView>(R.id.restTextView6).text = workouts[5].rest
    }

    data class Workout(val name: String, val sets: String, val reps: String, val rest: String, val imageResId: Int)

    }