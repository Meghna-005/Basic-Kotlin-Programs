// Simple Interest

fun si(p: Int, r: Int, t: Int) {
    val s= (p * r * t) / 100
    println("Simple Interest = $s")
}
fun main() {
    si(1000, 5, 2)
}