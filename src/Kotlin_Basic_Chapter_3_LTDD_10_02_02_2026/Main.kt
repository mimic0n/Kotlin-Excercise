package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026
fun main() {
    var x = readln()!!.toInt() ?: 0
    var checkVar = when (x) {
        in 1..3 -> println("Quý 1")
        in 4..6 -> println("Quý 2")
        in 7..9 -> println("Quý 3")
        in 10..12 -> println("Quý 4")
        else -> println("Invalid")
    }
    println(checkVar)
}