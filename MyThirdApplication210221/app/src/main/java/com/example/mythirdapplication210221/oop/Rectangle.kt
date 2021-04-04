package com.example.mythirdapplication210221.oop

import com.example.mythirdapplication210221.PrintAreaOnChangeDelegate

class Rectangle(x: Int,
                y: Int,
                width: Int,
                height: Int
) : AbstractShape(x, y), Comparable<Rectangle> {        //реализуем интерфейс Comparable

    var width: Int by PrintAreaOnChangeDelegate (width)
    var height: Int by PrintAreaOnChangeDelegate (height)


    override fun calcArea(): Double = width * height.toDouble()

    override val name: String = "Rectangle"

    //Функция сравнения объектов Rectangle
    override fun compareTo(other: Rectangle): Int {
        return (width + height) - (other.width + other.height)
    }

    //переопределим ф-цию toString для корректного вывода компонентов сета (можно сделать через Alt+Insert)
    override fun toString(): String {
        return "Rectangle (width = $width, height = $height)"
    }




}