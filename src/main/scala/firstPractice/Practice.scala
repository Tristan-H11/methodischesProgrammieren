package firstPractice

object Practice {

    /*
    Write a method to sum up all values 0..x not divisible by y
     */
    def sumAllNotDivisible(x: Int, y: Int): Int = {
        (0 to x).filter(e => e % y != 0).sum
    }

    /*
    Task 1
     */
    val constant: Int = 7

    /*
    Task 2
     */
    def square(x: Double): Double = {
        Math.pow(x, 2)
    }

    /*
    Task 3
     */
    def max(x: Double, y: Double): Double = {
        if (x >= y) x else y
    }

    /*
    Task 4
     */
    def abs(x: Double): Double = {
        if (x < 0) -x else x
    }

    /*
    Task 5
     */
    def modulo(x: Int, divisor: Int): Int = {
        x - divisor * Math.floor(x / divisor).toInt
    }

    /*
    Task 6
     */
    def factorial(number: Int): Long = {
        var product: Long = 1L
        (1 to number).foreach(e => product *= e)
        product
    }

    /*
    Task 8
     */
    def binaryToDecimal(number: Long): Int = {
        Integer.parseInt(number.toString, 2) //too lazy to calc manually
    }

    def binaryToDecimalFromString(number: String): Int = {
        binaryToDecimal(number.toLong)
    }

    /*
    Task 9
     */
    def reverseString(text: String): String = {
        text.reverse.mkString
    }

    /*
    Task 10
     */
    def countWords(sentence: String): Int = {
        sentence.split(" ").length
    }
}
