package com.example.mythirdapplication210221

enum class Color(
        val hex: String
) : Drawable {
    WHITE("#fff"),
    BLACK("#000"),
    RED("#f00") {
        override fun draw() {
            println("draw red color")
        }
    },
    BLUE("#00f");           //Нужно указать ";" после перечисления объектов чтобы добавить функцию

    fun someMethod() {

    }

    override fun draw() {
        println("draw color")
    }

    companion object {
        fun fromName(name: String): Color? {
            return values().find { it.name == name.toUpperCase() }
        }
    }
}