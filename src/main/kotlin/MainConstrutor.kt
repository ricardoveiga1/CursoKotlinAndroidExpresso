fun main() {


    //CONSTRUTOR

    //sobercarga de cosntrutor


//    val userA = UserConstructor("Ricardo Veiga", true)
//    val nameLentgh = userA.getameLength()
//    println(nameLentgh)
//    println(userA.name)
//    println(userA.isAdmin)
//
//
//    val userB = UserConstructor("Gustavo")
//    //userB.name = "Gustavo"
//    println(userB.getameLength())
//    println(userB.name)
//    println(userB.isAdmin)


    //Testando INIT dentro da pilha de construtores, comenta código acima e execute
    val user = UserConstructor()


    // PROPRIEDADES DO OBJETO
    //user.label = "Trocar o texto da label"
    println(user.label)

    val userA = UserConstructor("Kadico")
   //  userA.MAX_NAME_LENGH - não é possível acessar por ser privado, somente o objeto classe pode manipular



    //PROPRIEDADES DE COMPORTAMENTOS DA CLASSE(NÃO É DO OBJETO)






}