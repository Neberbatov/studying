package com.example.mythirdapplication210221.oop

import com.example.mythirdapplication210221.User
import com.example.mythirdapplication210221.Vehicle

//Наследование через двоеточие. После Vehicle пустые скобки, т.к. конструктор пуст
class Plane(
        val wingCount: Int,
        val doorCount: Int,
        maxSpeed: Int              // свойство maxSpeed есть у класса-родителя. Мы его обозначаем тут и передаем на вход конструктору при наследовании
) : Vehicle(maxSpeed) {

    var isDoorOpen: Boolean = false
        private set

    // добавим функцию высшего порядка (openCallBack). После "=" - действие по умолчанию
    fun openDoor(openCallBack: () -> Unit = { println("Door is opened") }) {
        if (!isDoorOpen) {
            openCallBack()
//            println("Door is opened")
        }
        isDoorOpen = true

    }

    fun closeDoor() {
        if (isDoorOpen) {
            println("Door is closed")
            if (::pilot.isInitialized) {
                println("Pilot is ready")
            } else {
                println("Cabin is empty")
            }
        }
        isDoorOpen = false
    }

    //Переопределение метода accelerate
    override fun accelerate(speed: Int) {
        if (isDoorOpen) {
            println("No accelerate with open door")
        } else {
            super.accelerate(speed)
        }
        //вызываем объект engine, тем самым создавая его (делегированное св-во через lazy)
        engine.use()
    }

    //Перегрузка метода accelerate
    fun accelerate(speed: Int, force: Boolean) {
        if (force) {
            if (isDoorOpen) {
                println("warning! You accelerate with open door")
            }
            super.accelerate(speed)         //обращаемся к родительскому методу, а не к стр.31
        } else {
            accelerate(speed)
        }
        engine.use()
    }

    override fun getTitle(): String = "Plane"

    private lateinit var pilot: User

    fun setPilot(pilot: User) {
        this.pilot = pilot
        println("Your pilot today is ${pilot.name} ${pilot.lastName}")
    }

    fun startFly() {
        openDoor()
        closeDoor()
        if (::pilot.isInitialized) {
            accelerate(100)
            println("Текущая скорость $currentSpeed. Полёт нормальный!")
        } else {
            println("Мы никуда не полетим без пилота")
        }

    }

    //Добавляем свойство с отложенной инициализацией - объект будет создан только при обращении к нему
    private val engine by lazy {
        Engine()
    }

    companion object {
        val default = Plane(2, 2, 1100)

        fun createWithDefaultWingCount(doorCount: Int, maxSpeed: Int): Plane {
            return Plane(wingCount = 2, doorCount = doorCount, maxSpeed = maxSpeed)
        }
    }
}

