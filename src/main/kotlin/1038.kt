import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val codigo = scanner.nextInt()
    val quantidade = scanner.nextInt()

    val preco = when (codigo) {
        1 -> 4.00
        2 -> 4.50
        3 -> 5.00
        4 -> 2.00
        5 -> 1.50
        else -> 0.00
    }

    val total = preco * quantidade

    println("Total: R$ %.2f".format(total))
}