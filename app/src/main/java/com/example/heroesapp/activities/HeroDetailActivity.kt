package com.example.heroesapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.R
import com.example.heroesapp.models.Hero
import com.squareup.picasso.Picasso

class HeroDetailActivity : AppCompatActivity() {
    lateinit var heroTextView: TextView
    lateinit var heroImageView: ImageView
    lateinit var heroDescriptionTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_detail)
        heroTextView = findViewById(R.id.hero_title)
        heroImageView = findViewById(R.id.hero_image)
        heroDescriptionTextView = findViewById(R.id.hero_description)
        val heroId = intent.getIntExtra("heroId",0)

        val hero = Hero.heroes.firstOrNull { hero -> hero.id == heroId }

        heroTextView.text = hero?.name
        heroDescriptionTextView.text = hero?.description
        Picasso.get().load(hero?.image).into(heroImageView)
    }
}