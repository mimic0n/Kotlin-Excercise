package Kotlin_Basic_Chapter_1_LTDD_10_19_01_2026

import kotlin.math.*

fun Tinh_Tong_2_So_Nguyen() {
    var x: Int? = null
    print("Nhap x:")
    x = readlnOrNull()?.toIntOrNull() ?: 0
    println("Nhap y:")
    var y: Int = readlnOrNull()?.toIntOrNull() ?: 0
    println("$x + $y = ${x + y}")
}

fun So_Sanh_2_So_Nguyen() {
    var x: Int? = null
    println("Nhap x:")
    x = readlnOrNull()?.toIntOrNull() ?: 0
    println("Nhap y:")
    var y: Int = readlnOrNull()?.toIntOrNull() ?: 0
    var result = if (x > y) x else y
    println("Max($x,$y) = $result")
}

fun Hom_Nay_La_Thu_May() {
    val day = 2
    val result =
            when (day) {
                1 -> "Monday"
                2 -> "Tuesday"
                3 -> "Wednesday"
                4 -> "Thursday"
                5 -> "Friday"
                6 -> "Saturday"
                7 -> "Sunday"
                else -> "Invalid day."
            }
    println(result)
}

fun Duyet_So_Trong_ForLoop() {
    val number = -2
    val result =
            when (number) {
                in 1..1000 -> "True"
                else -> "Invalid number."
            }
    println(result)
}

fun CaculateOddNumber(Integer_Number: Int): Int {
    var total: Int = 0
    for (i in 1..Integer_Number step 2) {
        total += i
    }
    return total
}

fun Solve_the_quadratic_equation() {
    println(" Nhập a : ")
    var a: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println(" Nhập b : ")
    var b: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println(" Nhập c : ")
    var c: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println(" Phương Trình Bậc 2 : " + a + "x^2 + " + b + "x + " + c + " = 0 ")
    if (a == 0.0 && b == 0.0 && c == 0.0) {
        println("Phương trình có vô số nghiệm ")
    } else {
        var delta: Double = b * b - 4 * a * c
        if (delta > 0) {
            var n1: Double = (-b + sqrt(delta)) / 2 * a
            var n2: Double = (-b - sqrt(delta)) / 2 * a
            println(" Phương Trình Có 2 Nghiệm : " + n1 + " Và " + n2)
        } else if (delta == 0.0) {
            var n3: Double = -b / 2 * a
            println(" Phương Trình Có Nghiệm Kép : " + n3)
        } else {
            println("Phương trình vô nghiệm ")
        }
    }
}

fun main() {

    println("Bài 1 : Kotlin Basic")
    Tinh_Tong_2_So_Nguyen()
    So_Sanh_2_So_Nguyen()
    Hom_Nay_La_Thu_May()
    Duyet_So_Trong_ForLoop()

    println("Bài 2 :")
    println("Nhập số nguyên dương n: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 0
    if (n <= 0) {
        println("n Phải là Số Nguyên Dương")
        return
    }
    println("Tổng các số lẻ từ 1 đến $n là: ${CaculateOddNumber(n)}")

    println("Bài 3 : Giải Phương Trình Bậc 2 : ")
    Solve_the_quadratic_equation()
}
