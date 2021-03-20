package com.example.mythirdapplication210221

import kotlin.random.Random

fun main() {
//     Вывод рандомного числа - четного и нечетного через random и takeIf/takeUnless
//    val number = Random.nextInt(100)
//            val evenOrNull = number.takeIf { it%2 ==0 }
//            val oddOrNull = number.takeUnless { it%2 ==0 }
//            println ("четный: $evenOrNull, нечетный: $oddOrNull")
    val arr = arrayOf("Ivan", "Petr", "Andrew")
        for (n in arr) {
            println(n)
        }

    arr.forEach { println (it) }
    arr.forEachIndexed { index, s -> println("$index $s")  }
    val arr1 = emptyArray<String>()

    val bigArray = Array (100) {index -> "User №$index"}
    println(bigArray[25])
}



