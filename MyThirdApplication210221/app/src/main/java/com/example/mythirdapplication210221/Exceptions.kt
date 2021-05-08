package com.example.mythirdapplication210221

import java.lang.NullPointerException

fun main() {
//    try {
//        println("Message before exception")
//        functionWithException()
//        println("Message after exception") //код после брошенного Exс не выполняется
////    } catch (t: Throwable) {
//    } catch (t: NullPointerException) {   //пытаемся поймать наследника Exc (безуспешно)
//        println("catch exception with info = ${t.message}")
//        // можно писать несколько блоков catch. Пишутся снизу иерархии (что логично)
//    } catch (t: Exception) {
//        println("catch exception higher lvl with info = ${t.message}")
//    }

    //Проверим логирование последующих вызовов функций
    functionOuter()
    // функция functionInner содержит исключение, но не содержит блока catch. Соответственно, код после Exc не будет работать
}

fun functionOuter() {
    println("functionOuter before")
    functionWithExceptionHandling()
    println("functionOuter after")
}

fun functionWithExceptionHandling() {
    println("functionWithExceptionHandling before")
    try {
        functionInner()
    } catch (t: Throwable) {
        println("catch Throwable with info = ${t.message}")
    }
    println("functionWithExceptionHandling after")
}

fun functionInner() {
    println("functionInner before")
    functionWithException()
    println("functionInner after")
}

fun functionWithException() {
    println("functionWithException before")
    throw Exception("exception with additional info")
    println("functionWithException after")
//    throw NullPointerException("exception with additional info")
}