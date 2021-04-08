package one.digitalInnovation.collections

fun main(){
    val salaries = doubleArrayOf(100.0, 906.0, 235.0)

    for(salary in salaries){
        println(salary)
    }
    println("*************************************")
    println("Highest salary:  ${salaries.max()}")
    println("Lowest salary:  ${salaries.min()}")
    println("Average salary:  ${salaries.average()}")
    println("*************************************")
    val highSalaryThan250 = salaries.filter { it > 250 }
    highSalaryThan250.forEach{
        println(it)
    }
}