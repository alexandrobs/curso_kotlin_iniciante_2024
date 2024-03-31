
fun endereco(rua: String, numero: Int, estado: String, cep: String) {
    println("Rua: $rua, " +
            "Número: $numero, " +
            "Estado: $estado, " +
            "Cep: $cep"
    )
}

fun endereco2(rua: String = "", numero: Int = 0, estado: String, cep: String) {
    println("Rua: $rua, " +
            "Número: $numero, " +
            "Estado: $estado, " +
            "Cep: $cep"
    )
}



fun main() {
    endereco("Das Bananeiras", 794, "Ceará", "60777-699")
    //se precisar chamar os parametros de forma desordenada
    endereco(cep = "60222-888", rua =  "Oliveira de Melo", estado = "Paraná", numero = 851)
    //se nao tiver um parametro pode modificar a funcao passando algum valor default, exemplo endereco2
    endereco2(estado = "São Paulo", cep = "52145-852")
}