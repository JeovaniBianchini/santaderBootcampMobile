package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.Banco

fun main() {

    val banco = Banco(nome = "DigioOneBank", numero = 0)

    println(banco.info())
}