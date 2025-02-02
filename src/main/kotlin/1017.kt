import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var tempoDeViagem = scanner.nextFloat()
    var veloMedia = scanner.nextFloat()

    var total:Float = tempoDeViagem * veloMedia / 12

    println("%.3f".format(total))

}