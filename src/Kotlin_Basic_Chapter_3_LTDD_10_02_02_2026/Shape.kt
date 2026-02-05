package Kotlin_Basic_Chapter_3_LTDD_10_02_02_2026

import kotlin.math.PI
import kotlin.math.sqrt

interface Shape {
    fun getArea(): Double
}

class RectangleOfShape(val width: Double, val height: Double) : Shape {
    override fun getArea(): Double {
        return width * height
    }
}

class Circle(val radius: Double) : Shape {
    override fun getArea(): Double {
        return PI * radius * radius
    }
}

class Triangle(val a: Double, val b: Double, val c: Double) : Shape {
    override fun getArea(): Double {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}

fun main() {
    val rectangle = RectangleOfShape(5.0, 10.0)
    val circle = Circle(7.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    println("Rectangle area: ${rectangle.getArea()}")
    println("Circle area: ${circle.getArea()}")
    println("Triangle area: ${triangle.getArea()}")
}
