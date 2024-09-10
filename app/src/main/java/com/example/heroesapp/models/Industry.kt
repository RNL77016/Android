package com.example.heroesapp.models

data class Industry(val id : Int, val name:String, val image :String){
    companion object{
        val industries = mutableListOf<Industry>(
            Industry(1,"Marvel","https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png"),
            Industry(2,"DC","https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/DC_Comics_logo.png/768px-DC_Comics_logo.png")
        )
    }
}
