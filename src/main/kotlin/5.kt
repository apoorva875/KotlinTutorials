// to perform simple calculation on two numbers in kotlin
import java.util.Scanner
fun main(){
    println("enter the value of a:")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    println("enter the value of b:")
    val b = input.nextInt()
    println("enter any of the following choices: +,-,*,/,%")
    val choice = input.next()[0]
    var result = when(choice){
        '+' -> a+b
        '-' -> a-b
        '/' -> a/b
        '*' -> a*b
        '%' -> a%b
        else -> println("invalid symbol input")
    }
    println("the result is: $result")
}