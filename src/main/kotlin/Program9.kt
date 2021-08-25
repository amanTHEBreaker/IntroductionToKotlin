import java.util.*;

fun main(args: Array<String>) {

    var read = Scanner(System.`in`)

    var num1 = read.nextInt()
    var num2 = read.nextInt()

    // similar to java
    var total = sum(num1,num2)
    println("Sum of ${num1} and ${num2} is ${total}")


}
// : Int sets the return type of sum function
fun sum(a: Int, b: Int) : Int{
    // similar to java
    return a+b
}

