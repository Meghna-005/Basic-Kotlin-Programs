// Find largest among three numbers

fun main(){
    var n = 1234
    var c=0
    var num = n
    while(n>0){
        n = n/10
        c++
    }
    println("No. of digits in $num: $c")
}