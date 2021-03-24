package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.AbstractShape
import com.example.mythirdapplication210221.oop.Rectangle
import com.example.mythirdapplication210221.oop.Shape

fun main() {
    val shape1 = Rectangle(x = 2, y = 1, width = 15, height = 36)
    shape1.printPosition()
    shape1.moveToPosition(6, 8)
    shape1.printPosition()

    println("Shape1 area = ${shape1.calcArea()}")
    println("Shape1 name is ${shape1.name}")

    val bigRectangle = Rectangle(x = 1, y = 1, width = 156, height = 23)
    val smallRectangle = Rectangle(x = 1, y = 1, width = 115, height = 66)

    when {
        bigRectangle < smallRectangle -> {
            println("Small is bigger")
        }
        else -> println("Big is bigger")
    }

    val set:MutableSet <Rectangle> = sortedSetOf(
            bigRectangle,
            smallRectangle,
            shape1
    )


    println(set)

    //Создание объекта интерфейса Shape через анонимный класс (через object)
    val shapeAnon = object : Shape {
        override val name: String = "Anonymous shape"

        override fun calcArea(): Double = 0.0

        val addField = 123

        fun addFun() = 234
    }

    shapeAnon.addField
    shapeAnon.addFun()
}