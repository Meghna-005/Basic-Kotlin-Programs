// Check whether a number is palindrome

fun main() {
    var n = 5
    var fact = 1
    var num = n
    while(n>0){
        fact=fact*n
        n--
    }
    println("$num factorial:$fact")
}