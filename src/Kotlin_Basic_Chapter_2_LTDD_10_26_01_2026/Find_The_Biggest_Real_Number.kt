package Kotlin_Basic_Chapter_2_LTDD_10_26_01_2026
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var n1: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var n2: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var n3: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var max: Double = n1
    if (n2 > max) {
        max = n2
    }
    if (n3 > max) {
        max = n3
    }
    println("Số lớn nhất là: $max")
}