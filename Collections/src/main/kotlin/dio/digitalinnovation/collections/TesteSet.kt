package dio.digitalinnovation.collections

fun main() {

    val maria = Funcionario("Maria", 5000.0, "CLT")
    val jose= Funcionario("José", 4000.0, "CLT")
    val joao = Funcionario("João", 9000.0, "PJ")

    val funcionarios1 = setOf(maria, jose)
    val funcionarios2 = setOf(joao)

    val resultUnion = funcionarios1.union(funcionarios2)
    println(resultUnion)
    println("===============")
    resultUnion.forEach {
        println(it)
    }

    println("==============")
    val funcionarios3 = setOf(joao, maria, jose)
    val resultSub = funcionarios3.subtract(funcionarios2)
    resultSub.forEach {
        println(it)
    }
    println("===========")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach {
        println(it)
    }


}