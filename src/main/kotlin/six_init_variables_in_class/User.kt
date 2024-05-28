package six_init_variables_in_class

class User(var name: String, var isAdmin: Boolean){
    
    lateinit var lastName: String //lateinit não preciso inicializar com null ou valor inicial, é usado para inicializar posteriormente
    fun output() = println("Meu nome é: $name $lastName")


}