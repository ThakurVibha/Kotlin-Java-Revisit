package kotlinfromzero.recursion

fun main() {
    val result = calculateFactorial(4)
    println("Here is factorial:  $result")
}

fun calculateFactorial(num: Int): Int {
    return if (num != 0) {
        num * calculateFactorial(num - 1)
    } else {
        1
    }
}