package com.example.heroesapp.models

//Creacion de lista fija de usuarios

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Ronaldo","ronilaguna@hotmail.com","rln123"),
            User("Curry","curry30@hotmail.com","curry123"),
            User("Bob Esponja", "bob@hotmail.com","bob123")
        )
    }
}

