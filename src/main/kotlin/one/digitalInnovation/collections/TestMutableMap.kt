package one.digitalInnovation.collections

fun main(){

    val joaquim = Employee( "Joaquim", 1650.00, "CLT")
    val raquel = Employee( "Raquel", 1400.00, "PJ")
    val raul = Employee( "Raul", 1100.00, "CLT")
    val luisa = Employee( "Luisa", 1970.00, "PJ")

    val repository = Repository<Employee>()

    repository.create(joaquim.name, joaquim)
    repository.create(luisa.name, luisa)
    repository.create(raul.name, raul)
    repository.create(raquel.name, raquel)

    println(repository.findById(joaquim.name))

    println("===============================")
    repository.findAll().forEach { println(it) }


    println("===============================")
    repository.remove(joaquim.name)
    repository.findAll().forEach { println(it) }
    println("===============================")


}