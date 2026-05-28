// Fibonacci series

fun main() {
    val n = 10
    var a = 0
    var b = 1
    println(a)
    println(b)

    for (i in 1..n-2) {
        val c = a + b
        println(c)
        a = b
        b = c
    }
}