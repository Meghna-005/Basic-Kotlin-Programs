// Temperature conversion

fun main() {
    // Celsius to Fahrenheit
    val cel= 30.0
    val fr = ((cel* 9)/ 5)+32
    println("Fahrenheit = $fr")

    // Fahrenheit to Celsius
    val f = 86.0
    val c = ((f - 32)*5)/9
    println("Celsius = $c")
}