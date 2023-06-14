package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

class Film(
    index: Long, title: String, description: String, year: Int,
    val director: String, val actors: List<Actor>, val duration: Int
) : Publication(index, title, description, year)