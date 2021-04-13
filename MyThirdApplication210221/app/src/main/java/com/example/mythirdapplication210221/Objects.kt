package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Car
import com.example.mythirdapplication210221.oop.Plane

fun main() {

    //Получим доступ к синглотну и его методам и свойствам
    Cars.nissan
    Cars.someMethod()
    Cars.accelerate(100)

    //Получаем доступ к компаньону, реализованному в классе Plane
    Plane.default
    val smallPlane = Plane.createWithDefaultWingCount(2,1200)
    println(smallPlane.wingCount)

}

//Создадим синглтон. В нем добавим свойства и метод
object Cars:Vehicle (200) {
    val toyota = Car (4,4)
    val nissan = Car (4,2)

    fun someMethod () {

    }
}