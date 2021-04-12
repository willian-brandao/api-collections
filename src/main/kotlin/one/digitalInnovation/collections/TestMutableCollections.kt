package one.digitalInnovation.collections

fun main(){
    val joaquim = Employee( "Joaquim", 1650.00, "CLT")
    val raquel = Employee( "Raquel", 1400.00, "PJ")
    val raul = Employee( "Raul", 1100.00, "CLT")
    val luisa = Employee( "Luisa", 1970.00, "PJ")

    val employees =  mutableListOf(luisa, raul)
    employees.forEach{println(it)}
    println("**********************")

    employees.add(joaquim)
    employees.forEach{println(it)}
    println("**********************")

    employees.remove(luisa)
    employees.forEach{println(it)}


    println("---------- Set -------------")
    val employeeSet = mutableSetOf(luisa)
    employeeSet.forEach { println(it) }

    println("===========================")
    employeeSet.add(raul)
    employeeSet.add(joaquim)
    employeeSet.add(raquel)
    employeeSet.forEach{println(it)}

    println("===========================")
    employeeSet.remove(joaquim)
    employeeSet.forEach { println(it) }
}