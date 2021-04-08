package one.digitalInnovation.collections

fun main() {
    val Joaquim = Employee( "Joaquim", 1650.00)
    val Raquel = Employee( "Raquel", 1400.00)
    val Raul = Employee( "Raul", 1100.00)

    val employees = listOf(Joaquim, Raquel, Raul)

    employees.forEach{println(it)}
    println("#################")
    println(employees.find { it.name == "Raquel" })
}
data class Employee(
    val name: String,
    val salary: Double
){
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
            ***************
        """.trimIndent()
}
