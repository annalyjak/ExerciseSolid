package com.lyjak.anna.exercisesolid.solid.l

open class Rectangle(open var width: Double = 0.0, open var height: Double = 0.00) {

    val area: Double
        get() {
            return width * height
        }

}