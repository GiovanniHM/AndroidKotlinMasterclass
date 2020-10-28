import java.awt.Color.red

fun main(args: Array<String>) {
 /*   val lives = 3;

    if (lives<1){
        println("Game over!")
    }*/

    /*println("How old are you: ")
    val ege = readLine();
    println("Your ege is $ege")
    */

    val tim = Player ("Tim")
    tim.weapon = (Weapon("Sword", 30))
    tim.show()

    val luis = Player("luis", 5, 3)
    luis.show()
//Intanciar clases y asignar valores a obj
    val tony = Player("tony", 10, 1000)
    tony.show()
    print(tony.weapon.name.toUpperCase())
    print(tony.weapon.damageInflicted)

    val machingun = Weapon("machingun", 120)
    tony.weapon = machingun;
    println(machingun.name)


    println(tim.weapon.name)
    println(tim.weapon.damageInflicted)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.inventory.add(redPotion)
    val chestArmor = Loot("+ 3 chest armor", LootType.ARMOR, 80.00)
    tim.showInventory()
    println(tim.toString())


}