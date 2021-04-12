package one.digitalInnovation.collections

fun main(){

    val pair: Pair< String, Double> = Pair("Luiz", 1800.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Key: $k - Value:  $v")}

    val map2 = mapOf(
        "John" to 1500.0,
        "Mary" to 3000.0
    )
    map2.forEach { (k, v) -> println("Key: $k - Value:  $v")}
}