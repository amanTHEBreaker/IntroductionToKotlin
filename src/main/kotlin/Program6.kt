import java.util.*

fun main() {

    var read = Scanner(System.`in`)

    println("Enter persons age")
    var age1 = read.nextInt()

    // using when expression

    when(age1) {
        in 1..17 -> println("Age is invalid")
        in 18..100 -> println("Age is valid")
        else -> {
            println("Out of range")
        }
    }

}