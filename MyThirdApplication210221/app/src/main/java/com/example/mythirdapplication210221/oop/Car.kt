package com.example.mythirdapplication210221.oop

class Car constructor(
        val wheelCount:Int = 4, //значение по умолчанию
        val doorCount: Int = 4,
        val bodyLength: Double = 3000.0,
        val bodyWidth: Double = 2500.0,
        val bodyHeight: Double = 1500.0
){
    init {
        println("Car init")
    }
    var currentSpeed:Int = 0

    //создаем дополнительный конструктор для класса
    constructor(wheelCount: Int, doorCount: Int, bodySize: Triple<Double, Double, Double>):  // тип Triple содержит три значения
            this (wheelCount, doorCount, bodySize.first, bodySize.second, bodySize.third)
}