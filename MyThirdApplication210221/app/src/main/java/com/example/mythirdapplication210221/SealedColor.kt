package com.example.mythirdapplication210221

sealed class SealedColor(
        val hex: String
) : Drawable {
    object White : SealedColor("#fff")
    object Black : SealedColor("#000") {
        override fun draw() {
            println("draw black sealed color")
        }
    }

    class CustomColor(hex: String) : SealedColor(hex)

    override fun draw() {
        println("draw sealed color")
    }

}
