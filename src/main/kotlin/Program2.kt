import java.util.*;

fun main(args : Array<String>) {
    println("Enter something to print : ")

    // !! --> null check
    // get the user input using readLine() method
    var input = readLine()!!

    println("Printing input got using readLin() : ${input}")
    // using scanner class
    var read = Scanner(System.`in`)
    var inp = read.nextInt();
    println("Printing input got using scanner : ${inp}")
}

// as per java's defination for readLine() : readLine() method of Console class in Java is used
// to read a single line of text from the console, which applies same to the kotlin
// In Kotlin, the type system distinguishes between references that can hold null (nullable references) and those that cannot (non-null references).
//   For example, a regular variable of type String cannot hold null:
/***
    fun main() {
    var a: String = "abc" // Regular initialization means non-null by default
    a = null // compilation error
    }
To allow nulls, you can declare a variable as a nullable string by writing String?:
    fun main() {
    var b: String? = "abc" // can be set to null
    b = null // ok
    print(b)
    }
 */