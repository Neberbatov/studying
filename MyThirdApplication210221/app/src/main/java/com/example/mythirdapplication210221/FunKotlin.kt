package com.example.mythirdapplication210221

fun main() {
    println("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: return
    println(n)
    println(calculateSumRecursive(n))
}

tailrec fun calculateSumRecursive(n: Int, accum: Int = 0): Int {
    return if (n == 0) {
        accum
    } else {
        calculateSumRecursive(n - 1, accum + n)
    }
}




