// Prime numbers from 1 to N

fun main() {
    val n = 20
    for (i in 2..n) {
        var prime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                prime = false
            }
        }
        if (prime) {
            println(i)
        }
    }
}