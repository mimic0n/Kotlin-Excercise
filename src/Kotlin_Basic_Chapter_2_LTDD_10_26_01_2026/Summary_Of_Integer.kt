package Kotlin_Basic_Chapter_2_LTDD_10_26_01_2026
fun main() {
    var n1: Int = readlnOrNull()?.toIntOrNull() ?: 0
    var n2: Int = readlnOrNull()?.toIntOrNull() ?: 0
    var n3: Int = readlnOrNull()?.toIntOrNull() ?: 0
    var sum = n1 + n2 + n3
    println("Tổng của ba số là: $sum")
}