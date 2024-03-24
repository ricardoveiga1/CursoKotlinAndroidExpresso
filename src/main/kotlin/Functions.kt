fun main(){
    // GLOSSARIO (var, val, fun, class, double, String, int, false, true, null)
    // functions - bloco de código reutilizaveis
    //toda função pode ter um tipo de retorno (double, String, int, etc) ou caso não tenha, pode usar () : Unit, a fun main é uma função unit(nao retorno nada)
    //declaração e o corpo da função
    // as funções podem ter ou não parametros

    olaMundo() //call
    //uma série de código

    val resposta1 = somar1()
    println(resposta1)

    val resposta2 = somar2()
    println(resposta2)

    //subtracao()

    inLine()

    verificarIdade(18)
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
fun verificarIdade(age : Int){
    if(age > 18){
        println("Pode dirigir")
    } else{
        println("Não pode dirigir")
    }
}