package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026
class Rectangle( var width:Double , var height:Double) {
    fun CaculateArea(): Double {
        var area:Double = (height * width)
        return area
    }
}

fun main() {
    var Rec =  Rectangle(6.0,2.0)
    println(Rec.CaculateArea())
}