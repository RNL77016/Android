package com.example.heroesapp.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Ronaldo","ronilaguna@hotmail.com","rln123")
        )
    }
}

