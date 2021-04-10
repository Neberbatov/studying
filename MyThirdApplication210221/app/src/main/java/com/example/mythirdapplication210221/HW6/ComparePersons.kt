package com.example.mythirdapplication210221.HW6


fun main() {
    val person1: Person = Person(193, 111, "Ivan Drago")
    val person2: Person = Person(193, 111, "Ivan Drago")
    val person3: Person = Person(178, 90, "Rocky Balboa")

    var setOfPersons = mutableSetOf(person1, person2)

    println("Количество элементов в сете = ${setOfPersons.size}")

    setOfPersons.add(person3)

    repeat(3) { person1.buyPet() }
    println(setOfPersons.elementAt(0))
    person1.showPets()

    repeat(2) { person3.buyPet() }
    println(setOfPersons.elementAt(1))
    person3.showPets()

}

