package dio.digitalinnovation.collections

fun main() {

    val values = IntArray(5)
    values[0] = 2
    values[1] = 5
    values[2] = 7
    values[3] = 1
    values[4] = 3

    for (valor in values){
        println(valor)
    }
    println("------------------")

    values.forEach {
        println(it)
    }
    println("-------------------")

    values.sort()
    for (valor in values){
        println(valor)
    }
}