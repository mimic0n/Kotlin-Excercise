package Kotlin_Basic_Chapter_2_LTDD_10_26_01_2026

class ManyTypeOfSum {
    fun Sum1( a: Int, b: Int, c: Int) : Int {
        return a + b + c
    }

    fun Sum2(a: Int, b: Int, c: Int)  {
        println("Sum2 result :${a + b + c} ")
    }

    var Sum3 = fun(a: Int, b: Int, c: Int): Int {
        return ( a + b + c)
    }

    var Sum4 = { a: Int, b: Int, c: Int -> a + b + c }

    fun Sum5(a: Int, b: Int, c: Int , d: Int ): Int {
        return d + Sum1( a, b, c)
    }
}

fun main() {
    val sumObj = ManyTypeOfSum()

    val a = 10
    val b = 20
    val c = 30
    val d = 5

    println("Sum1 result: ${sumObj.Sum1(a, b, c)}")

    sumObj.Sum2(a, b, c)

    println("Sum3 result: ${sumObj.Sum3(a, b, c)}")

    println("Sum4 result: ${sumObj.Sum4(a, b, c)}")

    println("Sum5 result: ${sumObj.Sum5(a, b, c, d)}")
}
