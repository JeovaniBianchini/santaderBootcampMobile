package dio.digitalinnovation.collections

fun main() {

    val salarios = arrayOf(
        "2000.0".toBigDecimal(),
        "3000.0".toBigDecimal(),
        "1500.0".toBigDecimal()
    )

    println(salarios.somatoria())

    println("=======================")
    
    println(salarios.media())
}