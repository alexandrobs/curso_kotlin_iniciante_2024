fun media(nota1: Float, nota2: Float) {
    val media = nota1 + nota2 / 2
    println("Média: $media")
}

//com n parametros de um tipo declarado (ex. float) a funcao media ficaria assim
fun media(vararg notas: Float) {
    var soma = 0f
    for (nota in notas){
        soma += nota
    }
    println("A média é: ${soma / notas.size}")
}

//com n parametros e aceitando diferentes tipos (usando um tipo generico)
fun <T> media(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    media(8f, 9.toFloat())
    media(5f, 6f, 9f, 10f)
    media("a", 1, 'd', "teste", 123, 45f, false)

    //exemplo de uso de parametros default
    val texto = "loren ipsun"
    texto.startsWith("l")
    texto.endsWith("L")
    texto.startsWith("L", true)
    texto.capitalize()
    texto.decapitalize()

    //exemplo de uso de vararg
    arrayOf(1,2,3,4,5,6,7,8,9)
}