package kotlinfromzero

import kotlin.math.pow


fun main() {
    val base = 2
    val exponent = 3

    val result = base power exponent
    println("$base raised to the power of $exponent is $result")

    val resultOfInfix = 3 add 5
    println(resultOfInfix) // Output: 8

    val performMultiplication= 4 multiply 22
    println(performMultiplication)
}

infix fun Int.power(exponent: Int): Int {
    return this.toDouble().pow(exponent).toInt()
}

//easy example

infix fun Int.add(x: Int): Int {
    return this + x
}

infix fun Int.multiply(x:Int):Int{
    return this * x
}

