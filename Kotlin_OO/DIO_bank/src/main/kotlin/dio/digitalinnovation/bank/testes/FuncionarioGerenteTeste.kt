package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.Analista
import dio.digitalinnovation.bank.Funcionario
import dio.digitalinnovation.bank.Gerente

fun main() {

    val funcMaria = Gerente(nome = "Maria", cpf = "11111", salario = 8000.00, senha = "senha123")

    ImprimeRelatorio.imprime(funcMaria)

    Autentica().autentica(funcMaria)

}

