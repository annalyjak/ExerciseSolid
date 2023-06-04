package com.lyjak.anna.exercisesolid.kiss

//is this name of the class correct?
class number_manager(private var mNumber: Int) {

    companion object {
        const val oneHundred = 100
    }

    fun multiply_number(value : Int) {
        mNumber = mNumber * value
    }
}