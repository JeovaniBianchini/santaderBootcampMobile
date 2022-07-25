package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.Analista
import dio.digitalinnovation.bank.Funcionario

fun main() {

    val funcJeovani = Analista(nome = "Bianchini", cpf = "98765", salario = 5000.00)

    ImprimeRelatorio.imprime(funcJeovani)

}

