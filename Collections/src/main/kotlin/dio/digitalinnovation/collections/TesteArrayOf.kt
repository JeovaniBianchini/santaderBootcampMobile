package dio.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 5, 8, 10, 1)

    values.forEach {
        println(it)
    }
    println("=============")

    values.sort()
    values.forEach {
        println(it)
    }
}