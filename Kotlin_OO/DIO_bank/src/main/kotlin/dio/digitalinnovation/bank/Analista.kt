package dio.digitalinnovation.bank

import java.math.BigDecimal

class Analista(
    nome: String, cpf: String, salario: Double

) : Funcionario(nome, cpf, salario) {
    override fun calcualaAuxilo() = salario * 0.1
}