// Reverse a number using loops
fun main() {
    var n = 1234
    var rev = 0
    while (n != 0) {
        val dig= n % 10
        rev = (rev * 10) + dig
        n /= 10
    }
    println("Reversed Number = $rev")
}