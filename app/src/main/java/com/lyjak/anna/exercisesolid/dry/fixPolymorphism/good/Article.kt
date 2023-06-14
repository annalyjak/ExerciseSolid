package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

class Article(
    index: Long, title: String, description: String, year: Int,
    author: String,
    val pages: Int
) : Literature(index, title, description, year, author)