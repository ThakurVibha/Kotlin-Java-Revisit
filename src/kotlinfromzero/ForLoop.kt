package kotlinfromzero

fun main() {
//    printing table of entered number
    var index=1
    println("Enter any number of your choice to print a table")
    val num= readLine()?.toInt()

    for(i in 1..10){
        println("$num x $index=${num?.times(index)}")
        index++
    }

    //for loop type 2(to manipulate value of 2, now counter will add 2 instead of 1)
    println(" ")
    for (i in 1..10 step 2) {
        println(i)
    }

    //for loop type 4(will include upper bound)
    println(" ")
    for (i in 1..5) {
        println(i)

    }

    //for loop type 4(will exclude upper bound)
    println(" ")
    for (i in 1 until 5) {
        println(i)
    }

    //for loop to print values in decreasing fasion
    println(" ")
    for(i in 10 downTo 2 step 2){
        println(i)
    }


}