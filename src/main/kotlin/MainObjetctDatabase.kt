fun main() {

   //OBJETOS UNICOS (SINGLETON)
    val userA = User2("Ricardo")
    println(Database.name)
    println(Database.userLogged?.name)

    login(userA)

    println(Database.userLogged?.name)

}

fun login(user: User2){
    Database.userLogged = user

}