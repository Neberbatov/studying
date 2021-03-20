package com.example.mythirdapplication210221.oop

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


}