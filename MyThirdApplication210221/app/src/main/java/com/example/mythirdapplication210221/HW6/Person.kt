package com.example.mythirdapplication210221.HW6

import kotlin.random.Random

class Person(
        val height: Int,
        val weight: Int,
        val name: String
) {
    val pets = hashSetOf<Animal>()
    private val petNames = listOf(
            "Tom",
            "Jerry",
            "Billy",
            "Willy",
            "Dilly",
            "Droopy",
            "Goofy",
            "Snoopy",
            "Snowball"
    )

    fun buyPet() {
        pets.add(Animal(
                energy = Random.nextInt(1, 10),
                weight = Random.nextInt(4, 40),
                name = petNames.elementAt(Random.nextInt(petNames.lastIndex))
        )
        )
//        pets.forEach { println(it) }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (height != other.height) return false
        if (weight != other.weight) return false
        if (name != other.name) return false
        if (pets != other.pets) return false

        return true
    }

    override fun hashCode(): Int {
        var result = height
        result = 31 * result + weight
        result = 31 * result + name.hashCode()
        result = 31 * result + pets.hashCode()
        return result
    }

    override fun toString(): String {
        return "The fighter $name has $height sm in height and his weight is $weight kg. " +
                "He has ${pets.size} animals:"
    }

    public fun showPets() {
        pets.forEach { println(it) }
    }
}

