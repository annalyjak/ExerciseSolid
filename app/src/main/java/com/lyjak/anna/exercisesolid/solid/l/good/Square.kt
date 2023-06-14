package com.lyjak.anna.exercisesolid.solid.l.good

class Square(side: Double) : Rectangle(side, side)

fun test() {
    val square = Square(1.0)
    square.calculateArea()
}