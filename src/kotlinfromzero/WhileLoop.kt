package kotlinfromzero

fun main() {
    //printing table for any number
    var index=1
    val count = readLine()?.toInt()
    while (index<=10){
        println(count?.times(index) ?: 0)
        index++
    }
    println(index)


}