class Player (val name: String, var live: Int = 1, var level: Int = 1) {
    var score = 0
    var weapon:Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

    fun show(){
        print("""""
                name: $name
                live: $live
                level: $level
                score: $score
                Weapon name: ${weapon.name}
                Weapon damage: ${weapon.damageInflicted}
        """)
    }
}