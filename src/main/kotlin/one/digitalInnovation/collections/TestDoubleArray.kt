package one.digitalInnovation.collections

fun main() {
    val salaries = DoubleArray(3)
    salaries[0] = 1000.0
    salaries[1] = 1300.0
    salaries[2] = 1600.0

    salaries.forEach { println(it) }
    println("*****************************************")

    salaries.forEachIndexed { index: Int, salary: Double ->
        salaries[index] = salary * 1.1
    }
    salaries.forEach { println(it)}
    println("*****************************************")
    val salaries2 = doubleArrayOf( 1550.0, 1760.0, 1890.0)
    salaries2.sort()
    salaries2.forEach { println(it) }
}