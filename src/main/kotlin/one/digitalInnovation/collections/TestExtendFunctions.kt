package one.digitalInnovation.collections

fun main(){

    val salaries = arrayOf(
        "2000".toBigDecimal(),
        "2500".toBigDecimal(),
        "4500".toBigDecimal()
    )

    println("*****************************")
    println(salaries.summation())

    println("*****************************")
    println(salaries.average())
}