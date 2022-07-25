package dio.digitalinnovation.bank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    var saldo: BigDecimal
) {
    fun depositar(valor: BigDecimal){
        saldo += valor
    }

    fun sacar(valor: BigDecimal){
        saldo -= valor
    }
}