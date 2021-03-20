package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Car

fun main() {
    val tesla = Car(
            wheelCount = 4, doorCount = 2, bodyLength = 3250.0,     //задаем параметры через конструктор
            bodyWidth = 2150.0, bodyHeight = 1750.0
    )
    println("tesla wheelCount = ${tesla.wheelCount}. Current speed = ${tesla.currentSpeed}")
    tesla.currentSpeed = 150
    println("Current speed = ${tesla.currentSpeed}")

    val nissan = Car (doorCount = 5)        // изменяем значение по умолчанию
    println("${nissan.bodyHeight}  ${nissan.doorCount}")

    //создаем объет через дополнительный конструктор
    val opel = Car(4,2, Triple(5000.0, 2500.0, 1800.0))

    println("Высота Опеля: ${opel.bodyHeight} мм")

}