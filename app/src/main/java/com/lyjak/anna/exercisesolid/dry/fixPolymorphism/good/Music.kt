package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

class Music(
    index: Long, title: String, description: String, year: Int,
    val band: String, val duration: Int
) : Publication(index, title, description, year)