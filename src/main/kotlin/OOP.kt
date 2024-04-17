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

    val userA = User()
    val userB = User()
    userA.name = "Kadico"
    //userB.name = "Guilherme"

   // println(userB.name)

    userA.printUpperCase()
    //userB.imprimieCaixaAlta()

    userA.updateName("Testandofucao")
    userA.printUpperCase()

    val buttonSuccess = Button()
    buttonSuccess.text = "Sucesso"
    buttonSuccess.color = "00FF00"

    val buttonCancel = Button()
    buttonSuccess.text = "Cancelar"
    buttonSuccess.color = "FF0000"

    val nameLentgh = userA.getameLength()
    println(nameLentgh)

    //usando molde da classe
    val userOOP = User()
    userOOP.name = "Ricardo"
    println(userOOP.getameLength())

}

class User1 {
    var name: String = "" // propriedade

    //responsabilidade
    fun printUpperCase(): Unit { // unit é função sem retorno
        println("Ola " + name.uppercase())
    }

    fun getNomeCaixaAlta(): String {
        val res = name.uppercase()
        return res
        //poderia ser return  nome.uppercase()
    }

    fun updateName(newName: String) {
        name = "$newName atualizado com sucesso"
    }

}

class filme{
    var titulo: String = ""
    var descricao: String= ""
    var elenco: String = ""
}