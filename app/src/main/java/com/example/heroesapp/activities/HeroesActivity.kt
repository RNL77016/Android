package com.example.heroesapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    lateinit var heroesTitle: TextView
    lateinit var heroesRecyclerView: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        heroesTitle = findViewById(R.id.heroes_title)
        heroesRecyclerView = findViewById(R.id.heroes_recyclerview)
        val publisherId = intent.getIntExtra("publisherId",0)
        Log.i("PublisherActivity","ID: ${publisherId}")

        val publisher = Publisher.publishers.firstOrNull { publisher -> publisher.id == publisherId }
        Log.i("PublisherActivity", publisher.toString())

        heroesTitle.text = publisher?.name
        val heroes = Hero.heroes.filter { hero -> hero.heroesId == publisherId }
        Log.i("PublisherActivity", heroes.toString())

        heroesRecyclerView.adapter = HeroAdapter(heroes){ hero: Hero ->
            val intent = Intent(this@HeroesActivity,HeroDetailActivity::class.java)
            intent.putExtra("heroId",hero.id)
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this,2)

    }
}