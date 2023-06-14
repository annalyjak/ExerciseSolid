package com.lyjak.anna.exercisesolid.solid.o.good

abstract class Product(val name: String? = null, var price: Double = 0.0) {
    abstract fun getTotal(): Double
}