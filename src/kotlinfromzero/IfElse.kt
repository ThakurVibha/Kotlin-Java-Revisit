package kotlinfromzero

fun main() {
    val isRaining = false
    val x = 10;
    val y = 10;
    if (!isRaining) {
        println("sky is clear")
    } else {
        println("take umbrella")
    }
    //other way
    val result = if (x > y) {
        "x is greater than y"
    } else if (x < y) {
        "x is less than y"
    } else {
        "x is equal to y"
    }
    println("result is-: $result")

    val resultOfEvenOdd = if (x % 2 == 0) "even" else "odd"
    println("result is $resultOfEvenOdd")

}