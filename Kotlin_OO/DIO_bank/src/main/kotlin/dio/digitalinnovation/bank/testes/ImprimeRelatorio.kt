package dio.digitalinnovation.bank.testes

import dio.digitalinnovation.bank.Funcionario

class ImprimeRelatorio {
    companion object {
       fun imprime(funcionario: Funcionario) = println(
           funcionario.toString()
       )
    }

}