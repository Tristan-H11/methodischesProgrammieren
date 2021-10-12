package KoenigAufgaben

object TaskOneToTwenty {
    
    /*
    Task 3
     */
    def square(x: Int): Int = x * x
    
    /*
    Task 4
     */
    def max(x: Int, y: Int): Int = if (x < y) y else x
    
    /*
    Task 5
     */
    def modulo(x: Int, y: Int): Int = x - y * (x / y)
    
    /*
    Task 6
     */
    def factorialIterative(x: Int): Long = {
        var result: Long = 1
        for (i <- 2 to x) {
            result *= i
        }
        result
    }
    
    def factorialRecursive(x: Int): Long = if (x == 1) 1 else x * factorialRecursive(x - 1)
    
    /*
    Task 7
     */
    def powerIterative(x: Int, y: Int): Long = {
        var result: Long = x
        for (i <- 0 until y) {
            result *= x
        }
        result
    }
    
    def powerRecursive(x: Int, y: Int): Long = {
        if (y == 1)
            x
        else
            x * powerRecursive(x, y - 1)
    }
    
    /*
    Task 8
     */
    def sumOfSquaresOfDigitsIterative(x: Int): Int = {
        var result = 0
        var input = x
        while (input > 0) {
            result += (input % 10) * (input % 10)
            input /= 10
        }
        result
    }
    
    def sumOfSquaresOfDigitsRecursive(x: Int): Int = {
        if (x > 0)
            (x % 10) * (x % 10) + sumOfSquaresOfDigitsRecursive(x / 10)
        else
            0
    }
    
    /*
    Task 9 (and task 10)
     */
    def fibonacciIterative(n: Int): Int = {
        if (n <= 1) return 1
        var fib = 1
        var prevFib = 0
        
        for (i <- 0 until n) {
            val temp = fib
            fib += prevFib
            prevFib = temp
        }
        fib
    }
    
    def fibonacciRecursive(n: Int): Int = {
        if (n <= 1)
            1
        else
            fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
    
    /*
    Task 11
     */
    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else {
            for (i <- 2 to Math.sqrt(n).toInt) {
                if( n % i == 0) return false
            }
            true
        }
    }
}
