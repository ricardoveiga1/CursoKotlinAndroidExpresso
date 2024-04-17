fun main() {


    //CONSTRUTOR

    //sobercarga de cosntrutor


    val userA = UserConstructor("Ricardo Veiga", true)
    val nameLentgh = userA.getameLength()
    println(nameLentgh)
    println(userA.name)
    println(userA.isAdmin)


    val userB = UserConstructor("Gustavo")
    //userB.name = "Gustavo"
    println(userB.getameLength())
    println(userB.name)
    println(userB.isAdmin)




}