package dio.digitalinnovation.collections

fun main() {
    val func1 = Funcionario("João", 9000.0, "CLT")
    val func2 = Funcionario("Pedro", 3000.0, "CLT")
    val func3 = Funcionario("Maria", 5000.0, "PJ")

    val listFunc = listOf(func1, func2, func3)

    listFunc.forEach {
        println(it)
        println("---------")
    }

    println(listFunc.find { it.nome == "Maria" })
    println("============")

    println(listFunc.sortedBy { it.salario }.forEach{ println(it)})
    println("===========")

    println(listFunc.groupBy { it.tipoContratacao }.forEach { println(it) })

}


