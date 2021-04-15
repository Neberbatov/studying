package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Rectangle

fun main() {

    listOf(1, 2, 3) + listOf(3, 4, 5)

    // Оператор plus мы перегрузили в классе Rectangle
    val sumRectangle = Rectangle(0, 0, 10, 20) +
            Rectangle(0, 0, 30, 50)

    println("Высота суммарного треугольника = ${sumRectangle.height}. " +
            "А ширина = ${sumRectangle.width}")

    val minusRectangle = -Rectangle(0,0,15,26)
    println(minusRectangle.height)

    println(sumRectangle)
}