package com.example.heroesapp.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Ronaldo","ronilaguna@hotmail.com","rln123"),
            User("Cristiano","cristiano7@hotmail.com","cr7123"),
            User("Curry","curry30@hotmail.com","curry30123")
        )
    }
}

