package dio.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 1000.00, "PJ")
    val maria = Funcionario("Maria", 3000.00, "PJ")
    val pedro = Funcionario("Pedro", 5000.00, "CLP")

    val repositorio = Repositorio<Funcionario>()

    repositorio.created(joao.nome, joao)
    repositorio.created(maria.nome, maria)
    repositorio.created(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))
    println("==============================")

    repositorio.findAll().forEach { println(it) }
    println("===============================")

    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }
}