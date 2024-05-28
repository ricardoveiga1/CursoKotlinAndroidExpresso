package six_init_variables_in_class

fun main(){
    //1. Inicializaçöes de variaveis


    val user = User("Ricardo", true)
    user.lastName = "Veiga"  //se não for inicializada, irá quebrar execução
    user.output()
}