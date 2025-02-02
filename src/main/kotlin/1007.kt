import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()
    val D = scanner.nextInt()

    val dif = (A * B - C * D)

    println("DIFERENCA = $dif")
}