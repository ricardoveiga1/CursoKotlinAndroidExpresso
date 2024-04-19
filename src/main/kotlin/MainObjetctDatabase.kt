fun main() {

   //OBJETOS UNICOS (SINGLETON)
    val userA = User2("Ricardo")
    println(Database.name)
    println(Database.userLogged?.name)

    login(userA)

    println(Database.userLogged?.name)

    val userB = User2("Ana Priscilla")
    login(userB)
    println(Database.userLogged?.name)// por ser object só tem uma instancia vida do objeto

    if (Constants.DOMAIN == "http://google.com"){
        //faz algo
    }else{
        //faz outra coisa
    }

    if (Constants.MAX_NAME_LENGHT > 10){
        //faz algo
    }

}

fun login(user: User2){
    Database.userLogged = user
}


//TODOS OBJECT SAO OBJETOS ÚNICOS, OU SEJA, NÃO EXISTE OUTRA ISTANCIA DESSE OBJETO VIVO NA APLICAÇÃO
object Constants {
    const val MAX_NAME_LENGHT = 8
    const val DOMAIN = "https://exemplo.com"
    const val IMAGE_PATH = "/images"
     const val PHOTO_EXT = ".jpg"
}

///MUITO IMPORTANTE
// CLASSES -> é molde para criar N objetos
// OBJETOS -> é o conjunto de prop. e comportamentos de um contexto do seu sistema (Button, LoginScrean, PassValidador)
// OBJECTS -> é um objeto também, só que ele é único , ou seja, não é igual a classe que sai de vários objetos(exemplo: banco de dados, sessão de unuário, Logs)