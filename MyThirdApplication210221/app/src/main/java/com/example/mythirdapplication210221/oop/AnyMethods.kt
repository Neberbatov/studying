package com.example.mythirdapplication210221.oop

fun main() {
    val car1 = Car (wheelCount = 4, doorCount = 4, bodyLength = 4000.0, bodyWidth = 2600.2)
    val car2 = Car (wheelCount = 4, doorCount = 4, bodyLength = 4000.0, bodyWidth = 2600.2)
    val car3 = car1

    println("car1 equals to car2 by reference = ${car1===car2}")
    println("car1 equals to car3 by reference = ${car1===car3}")
    println("car1 equals to car2 by value = ${car1==car2}") // без переопределения метода equals для класса Car результат будет false

    val cars = listOf(
            car1,
            Car(wheelCount = 4, doorCount = 2, bodyLength = 4100.0, bodyWidth = 2200.0),
            Car(wheelCount = 4, doorCount = 3, bodyLength = 3600.0, bodyWidth = 1800.0)
    )
    println(cars.contains(Car(wheelCount = 4, doorCount = 2, bodyLength = 4100.0, bodyWidth = 2200.0)))
}