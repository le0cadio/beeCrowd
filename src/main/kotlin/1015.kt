import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val x1 = scanner.nextFloat()
    val y1 = scanner.nextFloat()
    val x2 = scanner.nextFloat()
    val y2 = scanner.nextFloat()
    val distancia = Math.sqrt(Math.pow(x2 - x1.toDouble(), 2.0) + Math.pow(y2 - y1.toDouble(), 2.0))
    println("%.4f".format(distancia))


}