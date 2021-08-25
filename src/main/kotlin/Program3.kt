import java.util.*


fun main(args : Array<String>) {
    println("Enter your name : ")

    // !! --> null check
    // get the user input using readLine() method
    var input = readLine()!!


    println("Enter your age : ")
    // using scanner class
    var read = Scanner(System.`in`)
    var inp = read.nextInt();

    // syntax of printing variables in kotlin
    println("Your name : ${input}")
    println("Your age: ${inp}")
}