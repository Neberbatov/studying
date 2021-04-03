package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Car
import com.example.mythirdapplication210221.oop.Plane

fun main() {
    val car = Car(4, 2, 3000.0, 1500.5)
    val plane = Plane(2, 2, 900)

    plane.refuel(500)
    plane.setPilot(User("Dima", "Pilot"))
    plane.startFly()
}