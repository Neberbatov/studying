package com.example.mythirdapplication210221.oop

import com.example.mythirdapplication210221.PrintAreaOnChangeDelegate
import kotlin.math.pow

class Circle (
        radius:Double
        ):Shape {
            var radius:Double by PrintAreaOnChangeDelegate (radius)
    override val name: String = "Circle"

    override fun calcArea(): Double = Math.PI * radius.pow(2.0)
}