class User {
    var name: String = ""
    var cpf: CPF = CPF()

    //responsabilidade
    fun printUpperCase(): Unit { // unit é função sem retorno
        println("Ola " + name.uppercase())
    }

    fun updateName(newName: String) {
        name = newName //"$newName atualizado com sucesso"
    }

    fun getameLength() : Int{
        return name.length  // tudo entre parenteses são funcoes(COMPORTAMENTOS) do objeto String e sem () são PROPRIEDADES
    }
}