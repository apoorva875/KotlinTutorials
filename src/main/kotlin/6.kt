// kotlin program to swap two numbers
import java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    println("enter two integers: ")
    var x = sc.nextInt()
    var y = sc.nextInt()
    println("the integers before swapping is first:$x second:$y ")
    var temp = x
    x = y
    y = temp
    println("the integers after swapping is first:$x second:$y ")
}