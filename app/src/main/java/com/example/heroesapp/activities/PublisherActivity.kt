package com.example.heroesapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.CategoryAdapter
import com.example.heroesapp.models.Category
import com.example.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {
    lateinit var usernameTV : TextView
    lateinit var logoutBtn : ImageView
    lateinit var categoryRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        categoryRecyclerView = findViewById(R.id.category_recycleview)
        categoryRecyclerView.adapter = CategoryAdapter(Category.categories)
        categoryRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)


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