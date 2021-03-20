package com.example.mythirdapplication210221

fun main() {
//    println("please input a number: ")
//    val n = readLine()?.toIntOrNull()
//            ?.let { n ->
//                println("You has inputted $n")
//            }
//            ?: println("You has inputted not a number")
        println("please input a phrase: ")

//    calcLength("Hello")
    println (calcNod(21586, 436))

}

//fun calcLength (str: String?) {
//    val s = str ?: return
//    println("String length is ${str!!.length}")
//}

tailrec fun calcNod (a: Int, b: Int):Int {
    if (b==0) return a
    return calcNod(b, a%b)
}