package com.company.petkotlin.screen.pettype

import java.awt.Color
import java.util.*

object ColorGeneration {
    fun randomColor(): String {
        val ra = Random()
        val r: Int
        val g: Int
        val b: Int
        r = ra.nextInt(255)
        g = ra.nextInt(255)
        b = ra.nextInt(255)
        val color = Color(r, g, b)
        var hex = Integer.toHexString(color.rgb and 0xffffff)
        if (hex.length < 6) {
            hex = "0$hex"
        }
        return hex
    }
}