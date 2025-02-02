import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val distanciaPercorridaKm = scanner.nextInt()
    val combustivelGasto = scanner.nextFloat()
    val total = distanciaPercorridaKm /combustivelGasto


    println("%.3f km/l".format(total))
}