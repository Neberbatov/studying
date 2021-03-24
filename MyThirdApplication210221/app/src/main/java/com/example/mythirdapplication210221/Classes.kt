package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Boat
import com.example.mythirdapplication210221.oop.Plane

fun main() {
//    val tesla = Car(
//            wheelCount = 4, doorCount = 2, bodyLength = 3150.0,     //задаем параметры через конструктор
//            bodyWidth = 2150.0, bodyHeight = 1750.0
//    )
////    println("tesla wheelCount = ${tesla.wheelCount}. Current speed = ${tesla.currentSpeed}")
////    tesla.currentSpeed = 150
////    println("Current speed = ${tesla.currentSpeed}")
//
//    val nissan = Car(doorCount = 5)        // изменяем значение по умолчанию
//    println("${nissan.bodyHeight}  ${nissan.doorCount}")
//
//
////    //создаем объет через дополнительный конструктор
////    val opel = Car(4,2, Triple(5000.0, 2500.0, 1800.0))
////
////    println("Высота Опеля: ${opel.bodyHeight} мм")
//
//    tesla.accelerate(10)           //вызываем метод accelerate класса Car
//    tesla.decelerate(200)

//    tesla.currentSpeed = 100
//    println(tesla.currentSpeed)
//    println(tesla.fuelCount)

//    val boeing = Plane(wingCount = 2, doorCount = 4, maxSpeed = 700)
//
//    //чтобы каждый раз не обращаться к объекту boeing, используем scoped-функцию with() {}. В круглых скобках - ресивер.
//    with(boeing) {
//        refuel(1000)
//        openDoor()
//        accelerate(500)
//        accelerate(500, force = true)
//        decelerate(100)
//    }
//
//    //Объект дочернего класса может выступать в качестве объекта родительского класса
//    val vehicle: Vehicle = boeing
//
//    println("${vehicle is Plane}")    //проверка принадлежности объекта классу
//    println("${boeing is Plane}")
//
//    val newPlane:Plane = vehicle as Plane // Приведение типов
//    newPlane.closeDoor()

    val vehicle: Vehicle = Plane(wingCount = 2, doorCount = 4, maxSpeed = 700)
    println(vehicle.getTitle())

    //Пример полиморфизма. Берем getTitle, определенный в родителе Vehicle, и наблюдаем за его изменением для объектов дочерних классов
    listOf<Vehicle>(
            Vehicle(100),
            Plane(wingCount = 2, doorCount = 4, maxSpeed = 700),
            Boat(50)
    ).forEach {
        println(it.getTitle()) }

}




