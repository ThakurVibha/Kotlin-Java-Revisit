package kotlinfromzero

import kotlin.math.pow

//Function overloading and named arguements
fun main() {
    println(addition(num1 = 22, num2 = 222)
    )
    println(addition(22.3, 33.3)
    )

    //in kotlin we can assign a function in a variable

    var fn:(a:Double, b:Double)->Double=::addition
    println(fn(2.0, 3.0))
    fn=::power
    println(fn(2.0, 3.0))

}

fun power(a:Double, b:Double):Double{
    return a.pow(b)
}

fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun addition(num1: Double, num2: Double): Double {
    return num1 + num2
}