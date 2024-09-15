package com.example.heroesapp.models

// Creación de la lista de publishers

data class Publisher(val id : Int, val name:String, val image :String){

    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"DC","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/DC_Comics_logo.png/768px-DC_Comics_logo.png"),
            Publisher(2,"Marvel","https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png")

        )
    }
}
