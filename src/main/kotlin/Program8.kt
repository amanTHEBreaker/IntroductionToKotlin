import java.util.*

fun main() {
    // val num = arrayOf(1, 2, 3, 4)   //implicit type declaration
    // val num = arrayOf<Int>(1, 2, 3) //explicit type declaration
    val name = arrayOf<String>("Sam", "Malik","Amit")

/***
//    for(i in 0..name.size -1 ) {
//        println(name[i])
//    }
*/
    for(i in name) {
        println(i)
    }

    // with position
    println("With position")

    // here withIndex() method return index number and actual element
    for((index, item) in name.withIndex()) {
        println("${index} : ${item}")
    }
}

