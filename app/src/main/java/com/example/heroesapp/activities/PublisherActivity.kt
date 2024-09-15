package com.example.heroesapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Hero
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var publisherRecyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        publisherRecyclerView = findViewById(R.id.publisher_recycleview)

        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers){ publisher ->
            Log.i("Heroes desde Publisher", publisher.name)
            val intent = Intent(this@PublisherActivity,HeroesActivity::class.java)
            intent.putExtra("publisherId",publisher.id)
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        val user = User.users[1]
        usernameTV.text = user.computedName
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT","Cerrando sesion")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}