package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

class Book(
    index: Long, title: String, description: String, year: Int,
    author: String,
    val topics: List<String>
) : Literature(index, title, description, year, author)