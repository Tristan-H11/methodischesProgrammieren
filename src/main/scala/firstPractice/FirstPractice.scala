package firstPractice

import scala.annotation.tailrec

object FirstPractice {
    
    /*
    Write a method to sum up all values 0..x not divisible by y
     */
    def sumAllNotDivisible(x: Int, divisor: Int): Int = {
        (0 to x).filter(e => e % divisor != 0).sum
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
        // x * x
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
        x - divisor * (x / divisor)
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
    Task 7
     */
    def intersectionWithCoefficient(a1: Double, b1: Double, a2: Double, b2: Double): String = {
        if (a2 - a1 != 0) {
            val x = 0.0 + (b2 - b1) / (a1 - a2) //Adding 0.0 to manage -0.0
            val y = a1 * x + b1
            s"<$x>, <$y>"
        } else {
            "The lines are parallel."
        }
    }
    
    def intersectionWithPoints(pointOneA: (Double, Double), pointOneB: (Double, Double),
                               pointTwoA: (Double, Double), pointTwoB: (Double, Double)): String = {
        
        val a1: Double = (pointOneB._2 - pointOneA._2) / (pointOneB._1 - pointOneA._1)
        val b1: Double = pointOneA._2 - (a1 * pointOneA._1)
        
        val a2: Double = (pointTwoB._2 - pointTwoA._2) / (pointTwoB._1 - pointTwoA._1)
        val b2: Double = pointTwoA._2 - (a2 * pointTwoA._1)
        
        intersectionWithCoefficient(a1, b1, a2, b2)
    }
    
    /*
    Task 8
     */
    def binaryToDecimal(number: Long): Int = {
        binaryToDecimal(number.toString)
        
        //    var result: Long = 0
        //
        //    // Imitates 2^n. Is doubled after every while-iteration.
        //    var base: Long = 1
        //
        //    var temp: Long = number
        //    while (temp > 0) {
        //      val last_digit: Long = temp % 10
        //      temp /= 10
        //      result += last_digit * base
        //      base *= 2
        //    }
        //    result.toInt
    }
    
    @tailrec
    def isPalindromeOne(s: String, acc: Int = 0): Boolean ={
         if(acc == s.length/2)
            true
        else if(s.charAt(acc) != s.charAt(s.length - acc -1))
            false
        else
            isPalindromeOne(s, acc+1)
    }
    
    @tailrec
    def isPalindromeTwo(s: String): Boolean ={
        if(s.length <= 1)
            true
        else if (s.head != s.charAt(s.length -1))
            false
        else
            isPalindromeTwo(s.substring(1, s.length-1))
    }
    
    def binaryToDecimal(number: String): Int = {
        Integer.parseInt(number, 2)
        
        //    val length: Int = number.length - 1
        //    var result: Int = 0
        //    for (x <- 1 to length) {
        //      result += (number.charAt(length - x ).asDigit * Math.pow(2, x)).toInt
        //    }
        //    result
    }
    
    /*
    Task 9
     */
    def reverseString(text: String): String = {
        text.reverse.mkString
        
        
        //        var result = ""
        //        text.foreach(c => result = c + result)
        //        result
    }
    
    /*
    Task 10
     */
    def countWords(sentence: String): Int = {
        sentence.split("\\s+").length
    }
    
    @tailrec
    def checkParenthesis(input: String, klammerCounter: Int = 0): Boolean = {
    
        if(input.length == 1 && input == "("){
            return klammerCounter == -1
        }
    
        if(input.length == 1 && input == ")"){
            return klammerCounter == 1
        }
        
        if(input.length == 1){
            return klammerCounter == 0
        }
        if(input.charAt(0) == '('){
            checkParenthesis(input.tail, klammerCounter +1 )
        } else if(input.charAt(0) == ')'){
            checkParenthesis(input.tail, klammerCounter -1 )
        }
        else {
            checkParenthesis(input.tail)
        }
    }
    
    
    
    
    
    
    
    
}

/*

Callstack für "Luca"

Call 4: Input: a
"" + a    <-- Kein Rekursionsschritt mehr

Call 3: Input: ca
recursion(a) + c    <-- Rekursionsschritt mit recursion() ist gleichbedeutend zur ganzen oberen Zeile

Call 2: Input: uca
recursion(ca) + u   <-- Rekursionsschritt mit recursion() ist gleichbedeutend zur ganzen oberen Zeile

Call 1: Input: Luca
recursion(uca) + L <-- Rekursionsschritt mit recursion() ist gleichbedeutend zur ganzen oberen Zeile


"" + a +c + u + L => acuL

 */

























