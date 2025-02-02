import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextDouble()
    val B = scanner.nextDouble()
    val C = scanner.nextDouble()

    val peso_a =  2
    val peso_b =  3
    val peso_c =  5

    val media = ((A * peso_a) + (B * peso_b) + (C * peso_c)) / (peso_a + peso_b + peso_c)
    println("MEDIA = %.1f".format(media))
}