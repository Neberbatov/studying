package com.example.mythirdapplication210221

data class User(
        val name: String,
        val lastName: String,
        val age: Int = 0
) {
    var innerState: String = ""

    fun getFullNameLength () = "$name$lastName".length
}
