package com.example.mythirdapplication210221

open class Vehicle(
        val maxSpeed: Int
) {

            var currentSpeed: Int = 0
        get() {
            println("не надо обращаться к currentSpeed")
            return field        // нельзя return currentSpeed - ибо рекурсия. Работаем через field
        }
        private set(value) {
            println("не надо изменять currentSpeed")
            field = value
        }

    var fuelCount: Int = 0
        protected set

    open fun accelerate(speed: Int) {           //добавляем метод в класс. Делаем метод открытым для переопределения
        val needFuel = speed / 2

        if (fuelCount >= needFuel) {
            currentSpeed += speed
            useFuel(needFuel)               // добавлем метод внутрь другого метода - расход топлива при ускорении
        } else {
            println("Не хватает топлива для ускорения")
        }
    }

    open fun getTitle ():String {
        return "Vehicle"
    }

    fun decelerate(speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
        //функция maxOf возвращает одно из двух чисел (то, которое больше).
        // Таким образом не позволим скорости быть меньше 0
    }

    private fun useFuel(fuel: Int) {               //делаем метод доступным только в классе
        fuelCount -= fuel
        this.fuelCount
    }

    fun refuel(fuel: Int) {
        fuelCount += fuel
    }

}