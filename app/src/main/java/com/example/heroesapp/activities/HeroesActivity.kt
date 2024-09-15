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

        // Inicializa vistas
        heroesTitle = findViewById(R.id.heroes_title)
        heroesRecyclerView = findViewById(R.id.heroes_recyclerview)

        // Obtiene el publisherId desde el intent
        val publisherId = intent.getIntExtra("publisherId", 0)
        val publisher = Publisher.publishers.firstOrNull { it.id == publisherId }

        // Asigna el nombre del publisher al título
        heroesTitle.text = publisher?.name

        // Filtra héroes del publisher
        val heroes = Hero.heroes.filter { it.heroesId == publisherId }

        // Configura RecyclerView con adaptador y GridLayoutManager
        heroesRecyclerView.adapter = HeroAdapter(heroes) { hero ->
            val intent = Intent(this, HeroDetailActivity::class.java)
            intent.putExtra("heroId", hero.id)
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}