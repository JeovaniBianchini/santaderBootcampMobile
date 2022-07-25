package dio.digitalinnovation.collections

fun main() {

    val salarys = doubleArrayOf(7000.00, 2500.00, 4000.00)

    salarys.sort()
    salarys.forEach {
        println(it)
    }
    println("====================")

    println("Salario maior: ${salarys.maxOrNull()}")
    println("Salario menor: ${salarys.minOrNull()}")
    println("Salario medio: ${salarys.average()}")

    println("======================")
    val salaryFilterMaior2500 = salarys.filter { it > 2500 }
    println(salaryFilterMaior2500)

    println("==================")
    val salaryCount = salarys.count { it in 5000.0..8000.0 }
    println(salaryCount)

    println("=================")
    val salaryFind = salarys.find { it == 5000.0 }
    println(salaryFind)

    println("================")
    val salaryAny = salarys.any { it == 3000.0 }
    println(salaryAny)
}