package com.lyjak.anna.exercisesolid.solid.l.good

open class Rectangle(var width: Double = 0.0, var height: Double = 0.0): Shape {

    override fun calculateArea() = width * height

}