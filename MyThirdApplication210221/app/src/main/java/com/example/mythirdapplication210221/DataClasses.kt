package com.example.mythirdapplication210221

import com.example.mythirdapplication210221.oop.Car

fun main() {
    val user1 = User(name = "Vasya", lastName = "Petrov")
    user1.innerState = "state1"
    val user2 = User(name = "Petya", lastName = "Ivanov")

    println(user1 == user2)

    val user3 = user1.copy(lastName = "Copy-Petrov")
    val user4 = user2.copy()

    println(user2 == user4)

    println(user1)      //Data class имеет переопределенный toString()


    //Деструктивное определение - инициализировали переменные name и lastname как свойства объекта
    val (name, lastname) = User("Name5", "LastName5")
    println("Name = $name")
    println("LastName = $lastname")

    //развнозначно записи:
    val user6 = User("Name6", "LastName6")
    val name1 = user6.component1()
    val lastname1 = user6.component2()

    val users = listOf(
            user1,
            user2,
            user6
    )
    users.forEach { println(it.name) }
    //тоже самое через деструктивное определение
    users.forEach { (name, lastname) -> println("$name , $lastname") }

    //Деструктивное определение возможно только потому, что мы разложили свойства класса Car
    val (wheelCount, doorCount) = Car(4, 2, 3000.3, 25411.5)

    //Деструктивное определение работает для map. Можно обращаться к компонентам
    val map1 = mapOf(
            1 to "1",
            2 to "2"
    )
    for ((key,value) in map1) {
        key
        value
    }

}