package com.lyjak.anna.exercisesolid.solid.i.good

class DesktopComponent : Touchable, Validator {

    override fun touch(event: String) {
        throw UnsupportedOperationException("touch not supported")
    }

    override fun validate() {
        println("All UI is valid")
    }

}