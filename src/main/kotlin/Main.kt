fun main (){
    // GLOSSARIO (var, val, fun, class, double, String, int, false, true, null)

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


    //NUMEROS x TEXTOS , dá erro desta forma
    val numero1 = "10a"
    //val resposta1 = numero1.toInt()
    //println(resposta1)


    //NUMEROS GRANDES
    val numero : Long = 1_250_000_000 // posso declarar assim, para facilitar visualiação

    //OPERADORES LÓGICOS(+ - / *)
    val txtIdade: String = "34"
    println(txtIdade + "Minha idade!") // CONCATENANDO


    val boleana1 = false
    // true false / (1 - 0)
    println(!boleana1) // ! negativa


    //CRIPTOGRAFIA - CHAR
    val name1 : String = "Ricardo" // é uma sequencia de caracteres CHARS
    val primeiraLetra : Char = 'R'
    val sobreNome = '\t' // 16 bits
    println(name1 + primeiraLetra + sobreNome)


    //PRIMITIVOS 80%
    // int, double, String, short, byte, long, float, boolean, char

    val nome : String = "Ricardo Veiga" // OBJETO = TIPO
    val tamanhoNome = nome.length // funçao que muda o comportamento de um objeto(String)
    val novoNome = nome.uppercase() // acessar a propriedade de um objeto(String)
    println(tamanhoNome)
    println(novoNome)
    println("Bom dia".length)

    // FORMATAÇÃO DE TEXTO
    //1.
    val message =  "Olá Ricardo.\nSeu produto chegou!"

    println(message)
    //2.
    val welcome = """
        Olá Kadico,
        Seu produto chegou!
    """.trimIndent()
    println(welcome)

    val csv = """
        texto1,
        texto2,
        texto3
    """.replaceIndent(";")
    println(csv)

    //3.
    val nome3 = "Ricardo"
    val age3 = 34
    val preco3 = 20
    println("Olá, $nome3. Sua idade é ${age3 + 10}. Seu desconto é: $preco3 e seu nome possui ${nome3.length} caracteres  ")


    // CONDIÇÕES (CONTROLE DE FLUXO)
    // SE, SENÃO,  -> DEVE SER UMA EXPRESSÃO BOOLEANA
    // (<, <=, >, >=, !, ==, !=)

    val produto6 = "Iphone"
    if (produto6.length > 3 ){
        println("Produto cadastrado com sucesso")
    } else{
        println("Você não pode cadastrar esse produto")
    }

    val preco6 = 9_000
    if (preco6 > 30_000 ){
        println("Voce ganhou 30% de desconto")
    } else if (preco6 > 20_000){
        println("Voce ganhou 20% de desconto")
    } else if (preco6 > 10_000){
    println("Voce ganhou 10% de desconto")
    } else{
        println("Voce não ganhou desconto")
    }

    //CONDIÇOES COMPOSTAS
    var preco5 = 49
    val produto5 = "Teclado"
    //E
    //TRUE | TRUE   = true
    //TRUE | FALSE  = false
    //FALSE | TRUE  = false
    //FALSE | FALSE = false

    if (preco5 == 49 && produto5 == "Teclado"){
        println("sucesso")
    } else{
        println("falha")
    }

    //OU - no OU se a primeira expressão for verdadeira o bloco não checa a segunda
    //TRUE | TRUE   = true
    //TRUE | FALSE  = true
    //FALSE | TRUE  = true
    //FALSE | FALSE = false
    val a = 10
    val b = 0
    //println(10/0)
    if (a == 10 || 10/ b == 1){
        println("sucesso")
    } else{
        println("falha")
    }

    //COMPARARA STRINGS
    val produto7 = "Imac"
    val produto8 = "Imac"

    println(produto7 == produto8) // igual
    println(produto7 != produto8) // diferente


    //ACEITA NULL(Nullable)
    var produto9: String? = "Imac" // ? faz aceitar nulo
    produto9 = "Iphone"
    produto9 = null

    var endereco : String? = null //"Rua A"
    val qtdDeCaracteres = endereco?.length // length é uma propriedade de String, logo se a variável aceitar null, vai dar erro, portanto temos que add ? para o length só ser utilizado se a variável tiver alocação na memoria, ou seja, diferente de NULL
    println("Sua rua tem: ${qtdDeCaracteres}  caracteres") // segunda solução podemos usar IF ELSE para validar a variável antes de executar o bloco desejado

    //Operador ELVIS
    var endereco1 : String? = null
    val qtdDeCaracteres1 = endereco1?.length ?: 0 // sendo Null iremos definir o valor padrão 0 no lugar de null( consigo acessar propriedade lenght, então guardo na qtdDeCaracteres1, se não, defino valor padrão 0)
    println("Sua rua tem: ${qtdDeCaracteres1}  caracteres")


}