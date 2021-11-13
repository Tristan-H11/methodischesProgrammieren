package Practice2

import scala.annotation.tailrec

object PracticeTwo {
    
    /*
    Task 1
     */
    def power(n: Int, expo: Int): Double = {
        var (exponent: Int, basis: Double, result: Double) = (expo, n.toDouble, 1.0)
        
        if (expo < 0) {
            exponent = -expo
            basis = 1 / basis
        }
        for (_ <- 0 until exponent) {
            result *= basis
        }
        result
    }
    
    /*
    Task 2
     */
    def sumOfSquaresOfDigitsRecursive(x: Int): Int = {
        if (x > 0)
            (x % 10) * (x % 10) + sumOfSquaresOfDigitsRecursive(x / 10)
        else
            0
    }
    
    /*
    Task 3
     */
    def factorialRecursive(x: Int): Long = {
        if (x == 1)
            1
        else
            x * factorialRecursive(x - 1)
    }
    
    /*
    Task 4
     */
    def binaryToDecimal(number: String): Int = {
        val length: Int = number.length
        if (length == 0)
            return 0
        Integer.valueOf(number.substring(0, 1)) * Math.pow(2, length - 1).toInt + binaryToDecimal(number.tail)
    }
    
    /*
    Task 5
     */
    def reverseString(input: String): String = {
        if (input.length == 1)
            input
        else
            reverseString(input.tail) + input.head
    }
    
    /*
    Task 6
     */
    def countWords(sentence: String, lastWasWord: Boolean = false): Int = {
        if (sentence.isBlank) {
            if (lastWasWord)
                return 1
            return 0
        }
        if (sentence.head.isWhitespace) {
            if (lastWasWord) {
                return 1 + countWords(sentence.tail)
            }
            countWords(sentence.tail)
        }
        else countWords(sentence.tail, lastWasWord = true)
    }
    
    /*
    Task 7
     */
    @tailrec
    def isPalindromeOne(s: String, acc: Int = 0): Boolean = {
        if (acc == s.length / 2)
            true
        else if (s.charAt(acc) != s.charAt(s.length - acc - 1))
            false
        else
            isPalindromeOne(s, acc + 1)
    }
    
    @tailrec
    def isPalindromeTwo(s: String): Boolean = {
        if (s.length <= 1)
            true
        else if (s.head != s.charAt(s.length - 1))
            false
        else
            isPalindromeTwo(s.substring(1, s.length - 1))
    }
    
    /*
    Task 8
     */
    def fibonacciRecursive(n: Int): Int = {
        if (n <= 2)
            1
        else
            fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
    
    /*
    Task 9
    */
    def isPrime(n: Int): Boolean = {
        if (n <= 1)
            false
        else {
            for (i <- 2 to Math.sqrt(n).toInt) {
                if (n % i == 0) return false
            }
            true
        }
    }
    
    /*
    Task 10
     */
    def checkParenthesis(input: String): Boolean ={
        var mutableInput: String = input
        if(mutableInput.indexOf(')') < mutableInput.indexOf('('))
            return false
        
        while(mutableInput != "") {
            val s  = mutableInput.head
            if(s == ')')
                return false
                
            if(s == '('){
                if(mutableInput.contains(')')) {
                    mutableInput= mutableInput.replaceFirst("\\)","")
                    mutableInput= mutableInput.replaceFirst("\\(","")
                } else {
                    return false
                }
            }
            else {
                mutableInput = mutableInput.tail
            }
            
            if(!mutableInput.contains(')') && !mutableInput.contains('(')){
                return true
            }
        }
        true
    }
}
