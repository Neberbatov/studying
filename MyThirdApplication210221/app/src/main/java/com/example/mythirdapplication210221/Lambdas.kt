package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Plane

fun main() {
    val lambda = { println("text from lambda") }
    //Переменная выступает как функция. Для ее запуска напишем ее с круглыми скобками
    lambda()

    //Запишем лямбду с параметром
    val lambdaWithParams = { x: Int -> println("text in lambda with $x") }
    lambdaWithParams(5)

    val sumLambda = { x: Int, y: Int -> x + y }
    println(sumLambda(1, 5))

    val users = listOf(
            User(name = "Ivan", lastName = "Grey", age = 25),
            User(name = "Ivan", lastName = "Black", age = 30),
            User(name = "Jack", lastName = "Daniels", age = 15),
            User(name = "Hew", lastName = "Grant", age = 49)
    )

    val planes = listOf(
            Plane(wingCount = 4, doorCount = 2, maxSpeed = 700),
            Plane(wingCount = 2, doorCount = 3, maxSpeed = 800),
            Plane(wingCount = 1, doorCount = 4, maxSpeed = 1200)
    )

    //Сделаем отбор через цикл:
    var oldestUser: User? = null
    for (user in users) {
        val currentAge = user.age
        val maxAge = oldestUser?.age ?: Int.MIN_VALUE
        if (currentAge > maxAge) {
            oldestUser = user
        }
    }

    //Сделаем отбор по возрасту через лямбду
    val oldestUserMaxBy = users.maxBy { user: User -> user.age }
    //Тоже самое можно проще, обратившись сразу к user. Компилятор понимает, что это user: User
    val oldestUserMaxBy2 = users.maxBy { user -> user.age }

    val fasterPlane = planes.maxBy { plane -> plane.maxSpeed }
    //еще проще:
    val fasterPlane2 = planes.maxBy { it.maxSpeed }

    //злоупотребление it
    val fasterPlane3 = planes.maxBy { it.maxSpeed.let { it / 2 } }

    // функция getFullNameLength в классе User
    val longerNameUser = users.maxBy { it.getFullNameLength() }
    // Тоже самое, но через рефлексию (не работает)
    // val longerNameUser2 = users.maxBy { User::getFullNameLength }

    //вызовем метод openDoor с дефолтным значением -> openDoor()
    val littlePlane = Plane.default
//    littlePlane.openDoor()
    //вызовем метод openDoor с кастомным значением с лямбдой
    littlePlane.openDoor { println("force open door") }

    makeCalc { println("result = $it") }
    //данный код вместе с инлайн-функцией равнозначен:
//    val value = 1 + 1
//    println("result = $value")
}

inline fun makeCalc(callback: (Int) -> Unit) {
    val value = 1 + 1
    callback (value)

}