class Player (val name: String, var live: Int = 1, var level: Int = 1) {
    var score = 0
    var weapon:Weapon = Weapon("Fist", 1)
    val inventory = ArrayList<Loot>()

    fun show(){
       /* print("""""
                name: $name
                live: $live
                level: $level
                score: $score
                Weapon name: ${weapon.name}
                Weapon damage: ${weapon.damageInflicted}
        """)*/

        if (live > 0)
        {
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """""
                name: $name
                live: $live
                level: $level
                score: $score
                Weapon name: ${weapon}
        """
    }

    fun showInventory(){
        println("$name's Inventory")
        for (item in inventory){
            println(item)
        }
        println(inventory.get(0))
        println("=================================")

    }
}