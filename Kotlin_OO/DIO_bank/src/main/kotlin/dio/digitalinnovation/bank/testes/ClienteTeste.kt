package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.Cliente
import dio.digitalinnovation.bank.TipoConta

fun main() {

    val cliente = Cliente(nome = "Jose", cpf = "999", tipo = TipoConta.PF, senha = "00000")

    println(cliente)

    Autentica().autentica(cliente)
}