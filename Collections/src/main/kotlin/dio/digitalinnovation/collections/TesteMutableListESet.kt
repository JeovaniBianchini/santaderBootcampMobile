package dio.digitalinnovation.collections

fun main() {
    val maria = Funcionario("Maria", 3000.00, "CLT")
    val joao = Funcionario("João", 8000.00, "CLT")
    val pedro = Funcionario("Pedro", 10000.00, "PJ")

    val listFunc = mutableListOf(maria)
    listFunc.forEach {
        println(it)
    }
    println("=======================")

    listFunc.add(pedro)
    listFunc.add(joao)
    listFunc.forEach {
        println(it)
    }
    println("=======================")

    listFunc.remove(pedro)
    listFunc.forEach {
        println(it)
    }
    println("=======================")

    val setFunc = mutableSetOf(maria, pedro)
    setFunc.forEach {
        println(it)
    }
    println("=======================")

}