//OPÇÃO 1 - sem valor padrão + palavra constructor explicita
// class User constructor(var name: String) {

//OPÇÃO 2 - valor padrão
// class User constructor(var name: String) {

//OPÇÃO 3 - espera que o construtor receba o valor(var)
class UserConstructor constructor( var name: String, var isAdmin:Boolean) {

    companion object{ //ROPRIEDADE  E COMPORTAMENTO DA CLASSE, TODOS TEM ACESSO A ESTE COMPORTAMENTO
        //const COMPILAÇÃO(É CONSTANTE)
        //val EXECUÇÃO (é constante em tempo de execução)
        const val MAX_NAME_LENGHT = 8 // FICA VISIVEL APENAS NO ESCOPO DA CLASSE, A PROPRIEDADE FICA DISPONÍVEL A TODOS E NÃO APENAS AO NOVO OBJKETITO CRIADO NA INSTANCIAÇÃO
    // TODOS MOLDE QUE SAIR DA CLASSE, VAI SAIR COM MAX NAME = 8
    }

// POR CONVERSÃO SEMPRE DECLARAMOS AS VARIÁVEIS COMO VAL, DEPOIS SE PRECISARMOS, MUDAMOS PARA VAR
    //private val MAX_NAME_LENGHT = 8 // POR PADRAO USAMOS COMO UPPERCASE


    //var - mutavel
    //val - imutavel
    var label = "$name é admin do sistema: $isAdmin"


    // Tiago falou: INIT é como construtor (só que não tem parametros) e é executado depois do construtor padrão
    //o INIT é usado para inicializar log, banco de dados, ele é sempre utilizado para executar entre a PILHA de construtores(construtores não importa a ordem, a ordem é no momento da chamada da instancia passando parametro de cada cosntrutor)
    init{
        println("Olá INIT")
    }

    init{
        println("Olá INIT 2") // a Ordem importa, mas geralmente não usamos mais de um INIT, o chamado multinitialization
    }

    //construtor 2 - sobrecarga de construtor
    constructor(name: String): this(name, false) //direcionando para o primeiro construtor, quando chama esse, automaticamrnte chama o primieor construtor
    {
        println("Executei o construtor 2")
    }

    constructor(): this("Desconhecido"){
        println("Executa o Construtor 3")
    }



    //responsabilidade
    fun printUpperCase(): Unit {
        println("Ola " + name.uppercase())
    }

    fun updateName(newName: String) {
        if (newName.length > MAX_NAME_LENGHT) {
            //// faz o que quiser para atualizar nome do usuário e n±ao atualiza
        }
        name = newName
    }

    fun getameLength() : Int{
        return name.length
    }
}