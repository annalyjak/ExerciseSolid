package com.lyjak.anna.exercisesolid.dry.fixPolymorphism.good

open class Literature(
    index: Long, title: String, description: String, year: Int,
    val author: String
) : Publication(index, title, description, year) {

    fun print() {
        //get Literature position from database by index and print to file
    }

    override fun getSummary(): String { // this override wasn't necessary
        return "$title by $author ($year) \n $description"
    }

}