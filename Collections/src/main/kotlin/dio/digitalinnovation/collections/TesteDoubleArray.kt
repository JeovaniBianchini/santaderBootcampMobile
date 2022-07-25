package dio.digitalinnovation.collections

fun main() {

    val salarys = doubleArrayOf(3000.00, 1250.00, 550.00)

    salarys.sort()
    salarys.forEachIndexed{ index, salary ->
        salarys[index] = salary * 1.1

    }

    salarys.forEach{
        println(it)
    }
}