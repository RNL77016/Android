package com.example.heroesapp.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.Industry

class HeroesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        val heroesId = intent.getIntExtra("heroesId",0)
        Log.i("HeroesActivity","ID: ${heroesId}")

        val heroe = Industry.industries.firstOrNull { heroe -> heroe.id == heroesId }
        Log.i("HeroesActivity", heroe.toString())
    }
}