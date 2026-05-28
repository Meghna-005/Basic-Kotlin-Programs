// Sum of digits

fun main() {
    var n= 566
    var sum = 0
    var num = n
    while (n>0) {
        sum = sum + (n % 10)
        n =n/10
    }
    println("Sum of $num = $sum")
}