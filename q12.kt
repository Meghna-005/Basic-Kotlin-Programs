// Swap numbers

fun main() {
    // Using third variable
    var a = 10
    var b = 20
    var temp = a
    a = b
    b = temp
    println("Using third variable")
    println("a = $a")
    println("b = $b")

    // Without third variable
    var x = 5
    var y = 15
    x = x + y
    y = x - y
    x = x - y

    println("Without third variable")
    println("x = $x")
    println("y = $y")
}