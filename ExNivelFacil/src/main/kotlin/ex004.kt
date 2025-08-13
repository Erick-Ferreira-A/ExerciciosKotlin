fun main () {
    println(" ----- MEDIA DAS NOTAS ----- ")

    println("Digite sua primeira nota: ")
    val n1 = readln().toDouble()
    println("Digite sua segunda nota: ")
    val n2 = readln().toDouble()
    println("Digite sua terceira nota: ")
    val n3 = readln().toDouble()
    println("Digite sua quarta nota: ")
    val n4 = readln().toDouble()

    println("A sua media é: ${(n1 + n2 + n3 + n4) / 4}")
}