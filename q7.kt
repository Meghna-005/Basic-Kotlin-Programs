// Find largest among three numbers

fun largest(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}
fun main() {
    val res = largest(10, 5, 22)
    println("Largest Number = $res")
}