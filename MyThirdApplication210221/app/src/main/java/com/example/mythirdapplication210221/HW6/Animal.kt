package com.example.mythirdapplication210221.HW6

data class Animal(
        val energy: Int,
        val weight: Int,
        val name: String
) {
    override fun toString(): String {
        return "$name, weight is $weight, energy is $energy"
    }
}
