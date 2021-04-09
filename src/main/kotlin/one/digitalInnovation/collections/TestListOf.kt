package one.digitalInnovation.collections

fun main() {
    val Joaquim = Employee( "Joaquim", 1650.00, "CLT")
    val Raquel = Employee( "Raquel", 1400.00, "PJ")
    val Raul = Employee( "Raul", 1100.00, "CLT")
    val Luisa = Employee( "Luisa", 1970.00, "PJ")

    val employees = listOf(Joaquim, Raquel, Raul,Luisa)

    employees.forEach{println(it)}
    println("#################")

    //find a position by name
    println(employees.find { it.name == "Raquel" })
    println("#################")

    //organize list by ascending order
    employees
        .sortedBy { it.salary }
        .forEach{ println(it)}
    println("#################")

    employees
        .groupBy { it.category }
        .forEach{println(it)}
    println("#################")



}

