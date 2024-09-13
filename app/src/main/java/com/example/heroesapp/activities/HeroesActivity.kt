package com.example.heroesapp.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        val publisherId = intent.getIntExtra("publisherId",0)
        Log.i("PublisherActivity","ID: ${publisherId}")

        val publisher = Publisher.publishers.firstOrNull { publisher -> publisher.id == publisherId }
        Log.i("PublisherActivity", publisher.toString())
    }
}