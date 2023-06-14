package com.lyjak.anna.exercisesolid.solid.o.good

class ShoppingCartService {

    fun calculateTotalOrder(products: List<Product>): Double {
        var orderTotal = 0.0
        products.forEach { product ->
            orderTotal += product.getTotal()
        }
        return orderTotal
    }

}