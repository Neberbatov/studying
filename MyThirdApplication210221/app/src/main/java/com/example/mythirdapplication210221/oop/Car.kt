package com.example.mythirdapplication210221.oop

import com.example.mythirdapplication210221.User
import java.sql.Driver

class Car constructor(
        val wheelCount:Int = 4, //значение по умолчанию
        val doorCount: Int = 4,
        val bodyLength: Double = 3000.0,
        val bodyWidth: Double = 2500.0,
        val bodyHeight: Double = 1500.0
){
//    init {
//        println("Car init")
//    }
     var currentSpeed:Int = 0
        get() {
            println("не надо обращаться к currentSpeed")
            return field        // нельзя return currentSpeed - ибо рекурсия. Работаем через field
        }
        private set(value) {
            println("не надо изменять currentSpeed")
            field = value
        }

    //можно указать private для сеттера, т.о. защитив от изменений (сама переменная доступна для чтения)
    var fuelCount:Int = 50
        private set

    // Мы сделали currentSpeed - private, поэтому введем булеан, который будет показывать если 0.
//    val isStopped: Boolean
//        get() = currentSpeed==0

//    //создаем дополнительный конструктор для класса
//    constructor(wheelCount: Int, doorCount: Int, bodySize: Triple<Double, Double, Double>):  // тип Triple содержит три значения
//            this (wheelCount, doorCount, bodySize.first, bodySize.second, bodySize.third)

    fun accelerate (speed: Int) {           //добавляем метод в класс
        val needFuel = speed/2

        if (fuelCount >=needFuel) {
            currentSpeed += speed
            useFuel(needFuel)               // добавлем метод внутрь другого метода - расход топлива при ускорении
        } else {
            println("Не хватает топлива для ускорения")
        }
    }


    fun decelerate (speed: Int) {
        currentSpeed= maxOf (0, currentSpeed-speed)
    //функция maxOf возвращает одно из двух чисел (то, которое больше).
    // Таким образом не позволим скорости быть меньше 0
    }
    private fun useFuel (fuel: Int) {               //делаем метод доступным только в классе
        fuelCount-=fuel
        this.fuelCount
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (bodyLength != other.bodyLength) return false
        if (bodyWidth != other.bodyWidth) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + bodyLength.hashCode()
        result = 31 * result + bodyWidth.hashCode()
        return result
    }

    //Раскладываем свойства класса (основного конструктора) на компоненты
    operator fun component1 ():Int = wheelCount
    operator fun component2 ():Int = doorCount
    operator fun component3 ():Double = bodyLength
    operator fun component4 ():Double = bodyWidth

    private lateinit var driver: User

    fun setDriver (driver: User) {
        this.driver = driver
    }


}