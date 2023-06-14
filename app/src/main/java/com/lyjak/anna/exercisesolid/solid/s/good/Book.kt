package com.lyjak.anna.exercisesolid.solid.s.good

data class Book(
    val author: Author,
    val bookName: String? = null,
    val text: String? = null
) : Introduce, Printer {

    override fun introduce(): String = "This is $bookName book written by ${author.introduce()}"

    override fun print() = println(text)

}