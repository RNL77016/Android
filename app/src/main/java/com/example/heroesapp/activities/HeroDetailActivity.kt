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
    // Declaración de variables lateinit para los elementos de UI
    lateinit var heroTextView: TextView
    lateinit var heroImageView: ImageView
    lateinit var heroDescriptionTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Habilita la funcionalidad Edge-to-Edge para la actividad
        enableEdgeToEdge()
        // Asigna el layout de la actividad con los elementos de UI
        setContentView(R.layout.activity_hero_detail)

        // Inicializa las vistas del layout por ID
        heroTextView = findViewById(R.id.hero_title)
        heroImageView = findViewById(R.id.hero_image)
        heroDescriptionTextView = findViewById(R.id.hero_description)

        // Obtiene el ID del héroe desde los extras del intent
        val heroId = intent.getIntExtra("heroId", 0)

        // Busca el héroe por ID en la lista de héroes
        val hero = Hero.heroes.firstOrNull { hero -> hero.id == heroId }

        // Asigna el nombre y la descripción del héroe a los TextViews
        heroTextView.text = hero?.name
        heroDescriptionTextView.text = hero?.description

        // Usa Picasso para cargar la imagen del héroe en el ImageView
        Picasso.get().load(hero?.image).into(heroImageView)
    }
}