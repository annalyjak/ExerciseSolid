package com.lyjak.anna.exercisesolid.solid.s.good

data class Author(val name: String, val surname: String) : Introduce {

    override fun introduce() = "$name $surname"

}