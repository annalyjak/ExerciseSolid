package com.lyjak.anna.exercisesolid.solid.o.good

class Electronics(name: String?, price: Double) : Product(name, price) {
    override fun getTotal(): Double = price * 1.18
}