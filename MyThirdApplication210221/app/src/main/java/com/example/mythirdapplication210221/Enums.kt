package com.example.mythirdapplication210221

fun main() {
    val color = Color.BLACK
    Color.RED.draw()

    //Можем использовать .values для доступа ко всем объектам enum Color
    Color.values().forEach { it.draw() }
    Color.values().forEach { println(it.name) }
    Color.values().forEach { println(it.ordinal) } //Возвращает индекс объекта
    Color.valueOf("RED")

    Color.fromName("BLUE")

    SealedColor.Black
    SealedColor.CustomColor("ff0")
}

fun invertColor (color: Color): Color {
    return when (color) {
        Color.WHITE ->Color.BLACK
        Color.BLACK -> Color.WHITE
        Color.RED -> Color.BLUE
        Color.BLUE -> Color.RED
    }

    fun invertSealedColor (color: SealedColor): SealedColor {
        return when (color) {
            SealedColor.Black -> SealedColor.White
            SealedColor.White -> SealedColor.Black
            is SealedColor.CustomColor -> SealedColor.White
        }
    }

}