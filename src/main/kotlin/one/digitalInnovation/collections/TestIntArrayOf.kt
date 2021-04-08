package one.digitalInnovation.collections

fun main(){
    val values = intArrayOf( 5, 3, 11, 7, 15)

    values.forEach {
        println(it)
    }
    println("####################################")
    values.sort()
    values.forEach {
        println(it)
    }
}