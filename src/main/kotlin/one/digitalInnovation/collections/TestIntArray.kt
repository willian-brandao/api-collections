package one.digitalInnovation.collections

fun main(){
    val values = IntArray(6)

    values[0]= 108
    values[1]= 36
    values[2]= 12
    values[3]= 972
    values[4]= 3126
    values[5]= 324

    //iteration using the term "for" to show values in array
    for (value in values ){
        println(value)
    }
    println("==============================================")
    //the "it" is reference to variable
    values.forEach {
        println(it)
    }
    println("==============================================")
    //this iteration could be made in this way too
    values.forEach { value ->
        println(value)
    }
    println("==============================================")
    //here this interation show the content that is on position of index
    for ( index in values.indices){
        println(values[1])
    }
    println("==============================================")
    // .sort() make array to change to ascending order
    values.sort()
    for( value in values){
        println(value)
    }
}