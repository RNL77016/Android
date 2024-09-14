package com.example.heroesapp.models

import com.example.heroesapp.models.Hero

data class Hero(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val heroesId: Int
){
    companion object{
        val heroes = mutableListOf<Hero>(
            //Marvel
            Hero(1,"Capitan America", "hahaha", "https://i.pinimg.com/originals/ba/51/8d/ba518d47ab84170b087b6a64ae87703a.png",1),
            Hero(2, "Ironman", "hahaha", "https://i.pinimg.com/originals/e2/7f/e5/e27fe5b06bc777a7832b9b9e8e5ce291.png",1),
            Hero(3,"Wolverine", "hahahaha", "https://eltallerdehector.com/wp-content/uploads/2023/07/Descargar-Wolverine-png-Transparente.png",1),
            Hero(4,"Blackpanther", "hahaha", "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/Black-Panther-png-Transparent.png?resize=470%2C512&ssl=1",1),
            Hero(5,"Blackwidow", "hahaha", "https://www.pikpng.com/pngl/b/35-355871_black-widow-clipart-hd-black-widow-avengers-png.png",1),
            Hero(6,"Deadpool", "hahaha","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/89f9adda-0ce2-41ca-bd0a-629c69bba8e5/dapu7hc-bcaa35d1-b13d-4ad0-95ea-5c2cac7d285e.png/v1/fill/w_1024,h_1428/deadpool_png__1_by_anna_x_anarchy_dapu7hc-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTQyOCIsInBhdGgiOiJcL2ZcLzg5ZjlhZGRhLTBjZTItNDFjYS1iZDBhLTYyOWM2OWJiYThlNVwvZGFwdTdoYy1iY2FhMzVkMS1iMTNkLTRhZDAtOTVlYS01YzJjYWM3ZDI4NWUucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.fLfhvOStnKEWB480rrA83lV7_4CM2p8CoPe1BEXeEsU",1),
            Hero(7, "Thor", "hahaha","https://pngmaterial.com/dvsxyz02/uploads/thor-desenho-png.png",1),
            Hero(8,"Hulk", "hahaha","https://i.pinimg.com/originals/9d/28/ed/9d28ed4f08d480d51708e1213b8a94a2.png",1),
            Hero(9, "Spiderman", "hahaha","https://purepng.com/public/uploads/thumbnail//purepng.com-spidermanspider-manspidermansuperherocomic-bookmarvel-comicscharacterstan-leegamesmovie-1701528656381ojc7l.png",1),
            Hero(10,"Vision", "hahaha","https://static.wikia.nocookie.net/vsdebating/images/9/9d/Vision_art.png/revision/latest/scale-to-width-down/333?cb=20170724120923",1),

            //DC
            Hero(11,"Batman", "hahaha","https://pngimg.com/d/batman_PNG52.png",2),
            Hero(12,"Superman", "hahaha","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8e4c3336-0621-4c1d-ad77-dee35d7a12d2/dd0urcn-e8eeabb6-0d8a-45dc-91c8-79a77d7933e7.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzhlNGMzMzM2LTA2MjEtNGMxZC1hZDc3LWRlZTM1ZDdhMTJkMlwvZGQwdXJjbi1lOGVlYWJiNi0wZDhhLTQ1ZGMtOTFjOC03OWE3N2Q3OTMzZTcucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.7LGKGpPRAH2ZBmakFsBsxp5urKE-lg1pgnSYmjL4QH4",2),
            Hero(13,"Aquaman", "hahaha","https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/8/84/Aquaman.png/revision/latest?cb=20190918015708&path-prefix=es",2),
            Hero(14,"Wonderwoman", "hahaha","https://www.pngarts.com/files/1/Wonder-Woman-PNG-Image-Background.png",2),
            Hero(15,"Flash", "hahaha","https://i.pinimg.com/originals/83/10/59/83105916580f7b38172a68bc0cd688bb.png",2),
            Hero(16,"Green Lantern", "hahaha","https://www.pngall.com/wp-content/uploads/10/Green-Lantern-PNG-Images-HD.png",2),
            Hero(17,"Cyborg", "hahaha","https://static.wikia.nocookie.net/one-minute-melee/images/a/a3/Cyborg.png/revision/latest?cb=20180515183131&path-prefix=es",2),
            Hero(18,"Shazam", "hahaha","https://www.pngarts.com/files/4/Comic-Shazam-PNG-Image.png",2),
            Hero(19, "Green Arrow", "hahaha","https://static.wikia.nocookie.net/all-worlds-alliance/images/9/96/E408bacd4e65e8973a7b7b76f904004d.png/revision/latest?cb=20190110152329",2),
            Hero(20,"Atom", "hahaha","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/054a91f2-3cd8-45d1-89f2-dd4828550aeb/dftoeb3-dc76a8f2-6f59-4a7b-9187-d7ef490c5cec.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzA1NGE5MWYyLTNjZDgtNDVkMS04OWYyLWRkNDgyODU1MGFlYlwvZGZ0b2ViMy1kYzc2YThmMi02ZjU5LTRhN2ItOTE4Ny1kN2VmNDkwYzVjZWMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.W7axKO8d3Dokpyd1pQHk8O9wfpoShTn8ewfYLmOiQ4Q",2)
        )
    }
}