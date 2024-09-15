package com.example.heroesapp.models

import com.example.heroesapp.models.Hero

//Creacion de la lista de heroes

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
            Hero(1,"Capitan America", "Steve Rogers es un soldado mejorado durante la Segunda Guerra Mundial gracias al suero del súper soldado, convirtiéndose en el símbolo de la justicia como Capitán América, luchando por la libertad con su icónico escudo.", "https://i.pinimg.com/originals/ba/51/8d/ba518d47ab84170b087b6a64ae87703a.png",2),
            Hero(2, "Ironman", "Tony Stark, un genio multimillonario y filántropo, construyó una avanzada armadura de alta tecnología para salvar su vida y luego la usó para proteger al mundo como Iron Man.", "https://i.pinimg.com/originals/e2/7f/e5/e27fe5b06bc777a7832b9b9e8e5ce291.png",2),
            Hero(3,"Wolverine", "Logan es un mutante con poderes de regeneración acelerada, garras de adamantium y sentidos agudizados. Es un miembro clave de los X-Men, conocido por su actitud feroz y su lucha contra su pasado oscuro.", "https://eltallerdehector.com/wp-content/uploads/2023/07/Descargar-Wolverine-png-Transparente.png",2),
            Hero(4,"Blackpanther", "T’Challa es el rey de Wakanda, una nación avanzada tecnológicamente. Protege a su pueblo como Black Panther, usando habilidades mejoradas y un traje hecho de vibranio.", "https://i0.wp.com/eltallerdehector.com/wp-content/uploads/2023/04/Black-Panther-png-Transparent.png?resize=470%2C512&ssl=1",2),
            Hero(5,"Blackwidow", "Natasha Romanoff es una espía y asesina altamente entrenada, convertida en una de las agentes más letales de S.H.I.E.L.D. y miembro de los Vengadores, utilizando sus habilidades de combate cuerpo a cuerpo y tácticas de espionaje.\n" +
                    "\n", "https://www.pikpng.com/pngl/b/35-355871_black-widow-clipart-hd-black-widow-avengers-png.png",2),
            Hero(6,"Deadpool", "Wade Wilson es un mercenario con un sentido del humor irreverente y la capacidad de regenerarse rápidamente, lo que lo convierte en prácticamente inmortal. Conocido como el antihéroe Deadpool, es impredecible y rompe la cuarta pared.","https://pngimg.com/d/deadpool_PNG40.png",2),
            Hero(7, "Thor", " El dios del trueno de Asgard, hijo de Odín, usa su martillo Mjolnir para proteger tanto a su reino como a la Tierra. Thor es conocido por su inmenso poder y su nobleza.","https://pngmaterial.com/dvsxyz02/uploads/thor-desenho-png.png",2),
            Hero(8,"Hulk", "Bruce Banner, un científico expuesto a radiación gamma, se transforma en Hulk, una fuerza incontrolable y gigantesca de furia y poder físico casi ilimitado cuando se enfada.","https://i.pinimg.com/originals/9d/28/ed/9d28ed4f08d480d51708e1213b8a94a2.png",2),
            Hero(9, "Spiderman", "Peter Parker, un joven neoyorquino, adquiere poderes arácnidos tras ser mordido por una araña radiactiva. Como Spider-Man, protege la ciudad de Nueva York con su agilidad, fuerza y sentido arácnido.","https://purepng.com/public/uploads/thumbnail//purepng.com-spidermanspider-manspidermansuperherocomic-bookmarvel-comicscharacterstan-leegamesmovie-1701528656381ojc7l.png",2),
            Hero(10,"Vision", "Un androide creado con una combinación de vibranio y la Gema de la Mente, Visión posee superpoderes como vuelo, intangibilidad y la capacidad de disparar rayos de energía. Es un ser de gran inteligencia y moralidad.","https://static.wikia.nocookie.net/vsdebating/images/9/9d/Vision_art.png/revision/latest/scale-to-width-down/333?cb=20170724120923",2),

            //DC
            Hero(11,"Batman", "Bruce Wayne es un multimillonario que, tras presenciar el asesinato de sus padres, decide luchar contra el crimen en Gotham City como Batman, usando su intelecto, entrenamiento físico y tecnología avanzada.","https://pngimg.com/d/batman_PNG52.png",1),
            Hero(12,"Superman", "Clark Kent (Kal-El) es un alienígena del planeta Krypton con poderes extraordinarios, como vuelo, super fuerza y visión de calor. Como Superman, lucha por la justicia y es el mayor defensor de la Tierra.","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8e4c3336-0621-4c1d-ad77-dee35d7a12d2/dd0urcn-e8eeabb6-0d8a-45dc-91c8-79a77d7933e7.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzhlNGMzMzM2LTA2MjEtNGMxZC1hZDc3LWRlZTM1ZDdhMTJkMlwvZGQwdXJjbi1lOGVlYWJiNi0wZDhhLTQ1ZGMtOTFjOC03OWE3N2Q3OTMzZTcucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.7LGKGpPRAH2ZBmakFsBsxp5urKE-lg1pgnSYmjL4QH4",1),
            Hero(13,"Aquaman", "Arthur Curry es el gobernante de Atlantis y posee la capacidad de comunicarse con criaturas marinas. Como Aquaman, defiende los océanos y la Tierra, combinando fuerza sobrehumana con habilidades acuáticas.\n","https://static.wikia.nocookie.net/death-battle-fanon-wiki-en-espanol/images/8/84/Aquaman.png/revision/latest?cb=20190918015708&path-prefix=es",1),
            Hero(14,"Wonderwoman", "Diana Prince es una guerrera amazona de la isla de Themyscira, dotada de fuerza, agilidad y poderes divinos. Como Wonder Woman, lucha por la paz y la justicia utilizando su lazo de la verdad y brazaletes indestructibles.","https://www.pngarts.com/files/1/Wonder-Woman-PNG-Image-Background.png",1),
            Hero(15,"Flash", "Barry Allen es un científico forense que adquiere la capacidad de moverse a velocidades increíbles tras un accidente con partículas aceleradoras. Como Flash, protege Central City y manipula el tiempo y el espacio con su velocidad.","https://i.pinimg.com/originals/83/10/59/83105916580f7b38172a68bc0cd688bb.png",1),
            Hero(16,"Green Lantern", "Hal Jordan es un piloto que recibe un anillo de poder del Green Lantern Corps, que le permite crear cualquier cosa que imagine con energía verde, siendo el defensor del sector espacial asignado.\n","https://www.pngall.com/wp-content/uploads/10/Green-Lantern-PNG-Images-HD.png",1),
            Hero(17,"Cyborg", "Victor Stone fue transformado en mitad humano y mitad máquina tras un accidente. Como Cyborg, posee fuerza sobrehumana, tecnología avanzada integrada y la capacidad de interactuar con cualquier red informática.","https://static.wikia.nocookie.net/one-minute-melee/images/a/a3/Cyborg.png/revision/latest?cb=20180515183131&path-prefix=es",1),
            Hero(18,"Shazam", "Billy Batson es un joven que puede transformarse en el poderoso superhéroe Shazam, con habilidades divinas como vuelo, fuerza y control de rayos, al pronunciar su nombre mágico.\n","https://www.pngarts.com/files/4/Comic-Shazam-PNG-Image.png",1),
            Hero(19, "Green Arrow", "Oliver Queen es un arquero altamente entrenado y un vigilante de Star City. Como Green Arrow, usa su habilidad con el arco y flecha para combatir el crimen, con una fuerte inclinación hacia la justicia social.","https://static.wikia.nocookie.net/all-worlds-alliance/images/9/96/E408bacd4e65e8973a7b7b76f904004d.png/revision/latest?cb=20190110152329",1),
            Hero(20,"Atom", "Ray Palmer es un científico que puede reducir su tamaño a niveles subatómicos gracias a su traje especial, lo que le permite manipular la física cuántica y luchar contra el crimen como Atom.","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/054a91f2-3cd8-45d1-89f2-dd4828550aeb/dftoeb3-dc76a8f2-6f59-4a7b-9187-d7ef490c5cec.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzA1NGE5MWYyLTNjZDgtNDVkMS04OWYyLWRkNDgyODU1MGFlYlwvZGZ0b2ViMy1kYzc2YThmMi02ZjU5LTRhN2ItOTE4Ny1kN2VmNDkwYzVjZWMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.W7axKO8d3Dokpyd1pQHk8O9wfpoShTn8ewfYLmOiQ4Q",1)
        )
    }
}