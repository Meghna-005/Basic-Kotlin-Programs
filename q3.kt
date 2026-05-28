// Find sum of numbers from 1 to N
fun sum_num(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

fun main() {
    val n = 10
    println("Sum = ${sum_num(n)}")
}