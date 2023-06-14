package com.lyjak.anna.exercisesolid.solid.o.good

class Food(name: String?, price: Double) : Product(name, price){
    override fun getTotal(): Double = price + price * 0.08
}