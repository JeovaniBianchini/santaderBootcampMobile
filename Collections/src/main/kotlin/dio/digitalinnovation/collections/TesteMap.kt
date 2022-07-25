package dio.digitalinnovation.collections

fun main() {

    val pair: Pair<String, Double> = Pair("joao", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("chave: $k - valor: $v")}

    val map2 = mapOf(
        "Gerealt" to 10000.00,
        "Yasker" to 5000.00
    )

    map2.forEach { (k, v) -> println("chave: $k - valor: $v") }


}