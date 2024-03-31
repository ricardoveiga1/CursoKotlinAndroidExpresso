fun main(){

// GLOSSARIO (var, val, fun, class, double, String, int, false, true, null, ?:, return)
// OOP - Oriented Object Programing
// DRY - Don't repeat yourself
// Começamos a tratar tudo no mundo computacional como um objeto
// carros, animais, cachorro, usuário, pessoa, rg, botão, campo texto, validador de senha, banco de dados
// MOLDE(template)

    // classe é um molde responsável por criar N objetos(estes objetos possuem PROPRIEDADE / COMPORTAMENTOS)


    // objeto é a instancia(a criação) a partir daquele molde
    // uma vez modificado o molde, TODOS os objetos que saem vão receber a atualização


    val userA = Usuario()
    val userB = Usuario()
    userA.nome = "Kadico"
    userB.nome = "Guilherme"

    println(userB.nome)

    userA.imprimieCaixaAlta()
    userB.imprimieCaixaAlta()

}

class Usuario{
    var nome: String = "" // propriedade

    //responsabilidade
    fun imprimieCaixaAlta(): Unit { // unit é função sem retorno
        println("Ola " + nome.uppercase())
    }

    fun getNomeCaixaAlta(): String {
        val res = nome.uppercase()
        return res
        //poderia ser return  nome.uppercase()
    }

}

class filme{
    var titulo: String = ""
    var descricao: String= ""
    var elenco: String = ""
}