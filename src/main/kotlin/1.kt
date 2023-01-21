// find the sum on n odd and even numbers
fun main() {
    println("enter number of digits: ")
    val n = readLine()?.toInt()!!
    var result1 = 0
    var result2 = 0
    for (i in 0..n) {
        if (i % 2 == 0) {
            result1 +=i
        }
        else {
            result2 +=i
        }
    }
    println("the sum of the even numbers is: $result1 ")
    println("the sum of the odd numbers is: $result2 ")
}