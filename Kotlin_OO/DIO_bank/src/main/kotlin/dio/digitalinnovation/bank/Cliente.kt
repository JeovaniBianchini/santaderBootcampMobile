package dio.digitalinnovation.bank

class Cliente(
    nome: String,
    cpf: String,
    val tipo: TipoConta,
    val senha: String
): Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "00000" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Cliente: ${tipo.descricao}
    """.trimIndent()


}