package Kotlin_Basic_Chapter_2_LTDD_10_26_01_2026
fun main() {
    var a: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    var b: Double = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println(" Phương trình bậc 1 : ${a}x + ${b} = 0")
    if (a== 0.0 && b==0.0 ) {
        println(" Phương trình vô số nghiệm ")
    }
    else {
        if (a==0.0 && b!=0.0) {
            println(" Phương trình vô nghiệm ")
        }
        else {
            var x = -b/a
            println(" Phương trình có nghiệm x = $x ")
        }
    }
}