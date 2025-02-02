import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val segundos = scanner.nextInt()
    val horas = segundos / 3600
    val minutos = (segundos % 3600) / 60
    val segundosRestantes = segundos % 60

    println("%d:%d:%d".format(horas, minutos, segundosRestantes))
}