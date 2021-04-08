package one.digitalInnovation.collections

fun main(){
    val salaries = doubleArrayOf(100.0, 906.0, 235.0, 890.0, 456.0, 543.0, 267.0)

    for(salary in salaries){
        println(salary)
    }
    println("*************************************")
    println("Highest salary:  ${salaries.max()}")
    println("Lowest salary:  ${salaries.min()}")
    println("Average salary:  ${salaries.average()}")
    println("*************************************")
    val highSalaryThan250 = salaries.filter { it > 600 }
    highSalaryThan250.forEach{
        println(it)
    }
    println("*************************************")
    println(salaries.count{it in 900.0..1000.0})

    println("*************************************")
    println(salaries.find{it == 675.0})

    println("*************************************")
    println(salaries.any{it == 675.0})
}