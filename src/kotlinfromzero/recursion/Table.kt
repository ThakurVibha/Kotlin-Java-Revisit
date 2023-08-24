package kotlinfromzero.recursion

fun main() {
    printTableByRecursion(5, 1)
}

fun printTableByRecursion(num: Int, multiplier: Int) {
    if (multiplier <= 10) {
        println("$num * $multiplier = ${num * multiplier}")
        printTableByRecursion(num, multiplier + 1)
    }

}