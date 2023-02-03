// kotlin program to reverse a number
import java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    println("enter a number: ")
    var num: Int = sc.nextInt()
    var n = num
    var reverse = 0
    while (n > 0) {
        var digit = n %10
        reverse = reverse * 10 + digit
        n /= 10
    }
    println("reverse number: $reverse")
}