package firstPractice

import scala.annotation.tailrec

object Practice {

    /*
    Write a method to sum up all values 0..x not divisible by y
     */
    def sumAllNotDivisible(x: Int, y:Int): Int ={
        (0 to x).sum - (0 to x by y).sum
    }

    /*
    Task 1
     */
    val constant: Int = 7

    /*
    Task 2
     */
    val square: Double => Double = Math.pow(_:Double,2)

    /*
    Task 3
     */
    val max: (Double, Double) => Double = (x: Double, y: Double)  => if (x >= y) x else y

    /*
    Task 4
     */
    val abs: Double => Double = (x: Double)  => if (x < 0) x * (-1) else x

    /*
    Task 5
     */
    val modulo: (Int, Int) => Int = (x:Int, divisor:Int) => x - divisor * Math.floor(x/divisor).toInt

    /*
    Task 6
     */
    def factorial(number: Int): Long ={
        var product: Long = 1L
        (1 to number).foreach(e => product *= e)
        product
    }

    /*
    Task 8
     */
    def binaryToDecimal(number: Long): Int={
        Integer.parseInt(number.toString, 2)
    }

    def binaryToDecimalFromString(number: String): Int={
        binaryToDecimal(number.toLong)
    }

    /*
    Task 9
     */
    def reverseString(text: String): String={
        text.reverse.mkString
    }

    /*
    Task 10
     */
    def countWords(sentence: String): Int={
        sentence.split(" ").length
    }
}
