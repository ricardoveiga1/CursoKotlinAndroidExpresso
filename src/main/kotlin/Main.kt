fun main (){
    // GLOSSARIO (var, val, fun, class, double, String, int)

    // val é uma variavel IMUTAVEL
    // var é uma variavel MUTAVEL

    //NUMEROS - pesquisar no google sobre tabela asci do bits 010101
    val byte: Byte = 8    // 8 bit
    val short: Short = 16 // 16 bit
    val age: Int = 31          // 32 bit (será usado 99% do tempo)
    val long: Long = 192 // 64 bit

    val desconto: Float = 31.92f  // 32-bit
    val price: Double = 31.90


    //TEXTO
    var product = "Iphone"

    //BOOLEANO

    var boleana = true


    println(price::class) // ::class é para vc imprimit a tipagem da variavel
    println(product::class)
    println(age::class)
    println(boleana::class)


    //PADRAO CAMEL CASE
    val mediaDePreco = 22.4

    println(mediaDePreco::class)
    val resposta = mediaDePreco.toInt()
    println(resposta::class)



}