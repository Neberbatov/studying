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

    fun openDoor() {
        if (!isDoorOpen) {
            println("Door is opened")
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
            println("Мы никуда не полетим без пилота")}

    }
}

