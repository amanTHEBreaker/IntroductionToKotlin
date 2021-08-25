import java.util.*

fun main(args : Array<String>) {

    println("Enter your age : ")
    // using scanner class
    var read = Scanner(System.`in`)
    var age = read.nextInt();

    // if-else contition in kotlin
    if(age > 18) {
        println("valid age")
    } else {
        println("invlid age")
    }


}