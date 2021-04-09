package one.digitalInnovation.collections

fun main(){
    val joaquim = Employee( "Joaquim", 1650.00, "CLT")
    val raquel = Employee( "Raquel", 1400.00, "PJ")
    val raul = Employee( "Raul", 1100.00, "CLT")
    val luisa = Employee( "Luisa", 1970.00, "PJ")
    val miguel = Employee( "Miguel", 1250.00, "CLT")
    val laura = Employee( "Laura", 1970.00, "CLT")

    val employees1 = setOf(joaquim, raquel, laura)
    val employees2 = setOf(raul, luisa, miguel)

    val joinEmployee = employees1.union(employees2)
    joinEmployee.forEach{println(it)}
    println("****************************")

    val employees3 = setOf( miguel, raquel, luisa)
    val employeesSubtract = employees2.subtract(employees3)
    employeesSubtract.forEach{println(it)}
    println("****************************")

    val employeesIntersect = employees2.intersect(employees3)
    employeesIntersect.forEach{println(it)}

}