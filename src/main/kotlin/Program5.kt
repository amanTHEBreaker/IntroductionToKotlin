import java.util.*

fun main() {

    var read = Scanner(System.`in`)

    println("Enter first persons age")
    var age1 = read.nextInt()

    println("Enter second persons age")
    var age2 = read.nextInt()

    /***
     * Java style
        var max : Int
        if(age1 > age2) {
            max = age1
        } else
            max = age2

    */
    // kotlin style
    var max = if(age1 > age2) age1 else age2

    println("Older is ${max}")
}