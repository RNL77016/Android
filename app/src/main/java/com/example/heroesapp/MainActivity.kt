package com.example.heroesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.activities.PublisherActivity
import com.example.heroesapp.models.User
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // Variables para los campos de texto y botón de login
    lateinit var emailEditText: EditText
    lateinit var passwordEditText: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Verifica si el usuario ya está logueado
        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        if (isLogged) {
            val intent = Intent(this@MainActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Inicializa las vistas
        emailEditText = findViewById(R.id.emailET)
        passwordEditText = findViewById(R.id.passwordET)
        loginBtn = findViewById(R.id.btnLogin)

        // Acción del botón de login
        loginBtn.setOnClickListener { v ->
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Verifica si los campos están vacíos
            if (email.isEmpty() || password.isEmpty()) {
                Snackbar.make(v, "El correo electrónico o la contraseña están vacíos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Verifica si las credenciales son válidas
            val isValidUser = User.users.any { user -> user.email == email && user.password == password }
            if (!isValidUser) {
                Snackbar.make(v, "El correo electrónico o la contraseña son inválidos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Guarda el estado de sesión y navega a la siguiente actividad
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()
            val intent = Intent(this@MainActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}