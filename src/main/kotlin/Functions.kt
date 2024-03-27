fun main(){
    // GLOSSARIO (var, val, fun, class, double, String, int, false, true, null)
    // functions - bloco de código reutilizaveis

    //functions, escopo, fluxo if else, retornos, tipos, manipulação de memoria


    //toda função pode ter um tipo de retorno (double, String, int, etc) ou caso não tenha, pode usar () : Unit, a fun main é uma função unit(nao retorno nada)
    //declaração e o corpo da função
    // as funções podem ter ou não parametros
    //Parametros nomeados
    //Sobrecarga de funções

    olaMundo() //call
    //uma série de código

    val resposta1 = somar1()
    println(resposta1)

    val resposta2 = somar2()
    println(resposta2)

    //subtracao()

    inLine()

    //entre parenteses são os argumentos da função
    verificarIdade(34, "Kadico", true)
    verificarIdade(nome = "Guilherme", age = 3, isAdmin =  false)

    verificacaoParaLogin(34, "Kadico Sobrecarga 2", true)
    verificacaoParaLogin(34, "Kadico Sobrecarga 1")


    cadastroUsuario(3, "Guilherme")
    cadastroUsuario(34, "Kadico", true)
    cadastroUsuario(18, )


    val resultadoSoma = soma(2, 3)
    val resultadoMultiplicacao = multiplicacao(2.0, 3.5)

    println("Resulado da soma: ${resultadoSoma}")
    println("Resulado da multiplicacao: ${resultadoMultiplicacao}")

    println("Resulado da multiplicacao: ${multiplicacao(3.0, 5.5)}")

}

//função sem retorno
fun olaMundo() : Unit {
    println("Olá")
    println("Mundo")
    println(2+8)
}
fun somar1(){
    2+3 //printLn(2+3)
}

//função com retorno String
fun somar2() : String {
    val resultado = 2 + 3
    return "estou somando 2 com 3 e o resultado é: ${resultado}"
}

fun helloWorld() {
    println("Hello wolrd!")

    //funcao de escoro - RARO de usar
    fun subtracao(){
        println("uma mensagem ra usuario informando que começou a execução")
        println(10+10)
    }
    subtracao() // para poder fazer a call dela, somente fazendo chamada dentro da funcao de escopo, não é possível fazer na main
}

fun inLine() = println("Função inLine, sem { }")

fun verificarIdadeInLine(age : Int) = if(age > 18) println("Pode dirigir") else println("Não pode dirigir") // pode ser feito assim, é a mesma coisa que funcao abaixo

//função dinamica
fun verificarIdade(age : Int, nome: String, isAdmin: Boolean){ //entre pareteses são os parametros da função
    println("Minha idade é: ${age} e meu nome é: ${nome}, sou admin: ${isAdmin}")
    if(age > 18){
        println("Pode dirigir")
    } else{
        println("Não pode dirigir")
    }
}


//Sobrecarga
fun verificacaoParaLogin(age : Int, nome: String, isAdmin: Boolean) {
    println("INSTRUÇÃO 2: Minha idade é: ${age} e meu nome é: ${nome}, sou admin: ${isAdmin}")
}

fun verificacaoParaLogin(age : Int, nome: String) {
    println("INSTRUÇÃO 1: Minha idade é: ${age} e meu nome é: ${nome}")
}

//Matando a sobrecarga para escrever menos código
fun cadastroUsuario(age : Int, nome: String = "Desconhecido", isAdmin: Boolean = false) {
    println("usuário cadastrado com idade: ${age}, nome: ${nome}, admin: ${isAdmin}")
}


fun soma(x: Int, y: Int) : Int{//toda vez que definir o tipo de retorno, preciso adicionar return na função
    return x+y
}

fun multiplicacao(x: Double, y: Double): Double{
    return x*y
}

