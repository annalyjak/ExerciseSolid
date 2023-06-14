package com.lyjak.anna.exercisesolid.solid.d.good

class PrinterDesk(private val printer: Printer) {

    fun printFile() {
        printer.print("File Content")
    }

}


fun test() {
    val dotPrinter = DotMatrixPrinterPrinter()
    val consolePrinter = ConsolePrinter()

    val printerDesk = PrinterDesk(consolePrinter)

    printerDesk.printFile()
}