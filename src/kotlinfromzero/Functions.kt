package kotlinfromzero

fun main() {
    val result = add(2, 33)
    println(result)
    checkEvenOdd(13)
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun checkEvenOdd(num: Int): Boolean {
    if (num % 2 == 0)
    {
        println("true")
        return true
    }
    println("false")
    return false
}