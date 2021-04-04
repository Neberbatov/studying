package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Circle
import com.example.mythirdapplication210221.oop.Rectangle
import com.example.mythirdapplication210221.oop.Shape
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {

    val rectangle = Rectangle(0,0,10,53)
    println(rectangle.width)
    println(rectangle.height)
    rectangle.width = 25

    val circle = Circle (12.0)
    circle.calcArea()
    circle.radius = 24.0

}

// Реализуем делегированное свойство. Оно принимает в себя значение, параметризированное <T>.
// То есть можем использовать любой тип переменной на входе, он придет сразу с типом Т.
//


class PrintAreaOnChangeDelegate<T>(
        private var value: T
) : ReadWriteProperty<Shape, T> {
    override fun getValue(thisRef: Shape, property: KProperty<*>): T = value

    override fun setValue(thisRef: Shape, property: KProperty<*>, value: T) {
        println("Before change property ${property.name} = ${thisRef.calcArea()}")
        this.value= value
        println("After change property ${property.name} = ${thisRef.calcArea()}")
    }
}