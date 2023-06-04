package com.lyjak.anna.exercisesolid.solid.d

class PrinterDesk(private val printer: DotMatrixPrinterPrinter) {

    fun printFile() {
        printer.print("File Content")
    }

}