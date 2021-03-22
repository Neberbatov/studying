package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Car
import com.example.mythirdapplication210221.Vehicle

fun main() {
    val tesla = Car(
            wheelCount = 4, doorCount = 2, bodyLength = 3150.0,     //задаем параметры через конструктор
            bodyWidth = 2150.0, bodyHeight = 1750.0
    )
//    println("tesla wheelCount = ${tesla.wheelCount}. Current speed = ${tesla.currentSpeed}")
//    tesla.currentSpeed = 150
//    println("Current speed = ${tesla.currentSpeed}")

    val nissan = Car(doorCount = 5)        // изменяем значение по умолчанию
    println("${nissan.bodyHeight}  ${nissan.doorCount}")


//    //создаем объет через дополнительный конструктор
//    val opel = Car(4,2, Triple(5000.0, 2500.0, 1800.0))
//
//    println("Высота Опеля: ${opel.bodyHeight} мм")

    tesla.accelerate(10)           //вызываем метод accelerate класса Car
    tesla.decelerate(200)

//    tesla.currentSpeed = 100
//    println(tesla.currentSpeed)
//    println(tesla.fuelCount)

    }




