package one.digitalInnovation.collections

fun main(){
    val animals = Array( 5){" "}
    animals[0] = "cat"
    animals[1] = "dog"
    animals[2] = "elephant"
    animals[3] = "snake"
    animals[4] = "rat"

    animals.forEach(){
        println(it)
    }
    println("###########################################")
    animals.sort()
    animals.forEach { println(it) }

    println("###########################################")
    val mammals = arrayOf("monkey", "dolphin", "humans")
    mammals.sort()
    mammals.forEach { println(it) }
}