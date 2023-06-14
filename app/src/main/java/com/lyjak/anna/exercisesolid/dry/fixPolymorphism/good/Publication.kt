package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

open class Publication(val index: Long, val title: String, val description: String, val year: Int) {

    open fun getSummary(): String {
        return "$title ($year) \n $description"
    }

}