package com.lyjak.anna.exercisesolid.solid.d.good

class DotMatrixPrinterPrinter : Printer {

    override fun print(sth: String) {
        println(". . $sth . .")
    }

}

class ConsolePrinter : Printer {

    override fun print(sth: String) {
        println(sth)
    }
}