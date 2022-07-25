package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.TipoConta

fun main() {

    TipoConta.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = TipoConta.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = TipoConta.PJ
    println("${pj.name} - ${pj.descricao}")
}