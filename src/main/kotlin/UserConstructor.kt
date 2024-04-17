//OPÇÃO 1 - sem valor padrão + palavra constructor explicita
// class User constructor(var name: String) {

//OPÇÃO 2 - valor padrão
// class User constructor(var name: String) {

//OPÇÃO 3 - espera que o construtor receba o valor(var)
class UserConstructor constructor( var name: String, var isAdmin:Boolean) {

    //construtor 2 - sobrecarga de construtor
    constructor(name: String): this(name, false) //direcionando para o primeiro construtor, quando chama esse, automaticamrnte chama o primieor construtor
    {
        println("Executei o construtor 2")
    }



    //responsabilidade
    fun printUpperCase(): Unit {
        println("Ola " + name.uppercase())
    }

    fun updateName(newName: String) {
        name = newName
    }

    fun getameLength() : Int{
        return name.length
    }
}