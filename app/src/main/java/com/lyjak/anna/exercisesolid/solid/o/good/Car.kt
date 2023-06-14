package com.lyjak.anna.exercisesolid.solid.o.good

class Car(name: String?, price: Double) : Product(name, price){
    override fun getTotal(): Double = price * 1.60 * 1.18
}