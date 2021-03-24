package com.example.mythirdapplication210221.oop

abstract class AbstractShape(
        private var x: Int,
        private var y: Int
):Shape {                                  //наследуемся от интерфейса Shape

//    abstract fun calcArea ():Double     //для абстрактных методов можно не указывать тело ф-ции
//
//    abstract val name:String

    fun moveToPosition(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun printPosition() {
        println("Shape with position (x = $x, y = $y)")
    }
}