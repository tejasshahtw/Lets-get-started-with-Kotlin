package io

import java.io.File

fun main() {
    var lineNumber: Int=1
    File("src/inputFile").forEachLine {
        println("#$lineNumber $it")
        lineNumber++
    }
}