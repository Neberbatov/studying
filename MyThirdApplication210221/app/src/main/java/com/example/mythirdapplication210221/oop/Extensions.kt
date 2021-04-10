package com.example.mythirdapplication210221.oop

fun main() {
    1.toBoolean()
    1.isPositive

    val nullableInt: Int? = null
    //Создали
    nullableInt.orDefault(0)
}

//Делаем расширение для класса Int. В данном случае toBoolean - название функции-расширения.
private fun Int.toBoolean(): Boolean {
    return this != 0
}

//Делаем расширение для класса Int. В данном случае isPositive - название расширения свойства.
val Int.isPositive: Boolean
    get() = this > 0

//Делаем расширение, которое возвращает в случае null значение по умолчанию. Если не null - исходное
private fun Int?.orDefault (defaultValue:Int):Int {
    return this ?:defaultValue
}