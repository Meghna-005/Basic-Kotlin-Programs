// Check whether a number is palindrome

fun main() {
    var n = 121
    val num = n
    var rev= 0
    while (n!= 0) {
        val dig = n % 10
        rev = rev * 10 + dig
        n /= 10
    }
    if (num == rev) {
        println("$num is Palindrome")
    } else {
        println("$num is Not Palindrome")
    }
}