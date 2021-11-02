package Practice2

import PracticeTwo._
import org.scalatest.funsuite.AnyFunSuite

class PracticeTwoTest extends AnyFunSuite{
    
    test("5 hoch 3 = 125"){
        assert(power(5, 3) == 125.0)
    }
    
    test("2 hoch -3 = 0.125"){
        assert(power(2, -3) == 0.125)
    }
    
    test("SumOfSquareDigits 139 = 91"){
        assert(sumOfSquaresOfDigitsRecursive(139) == 91)
    }
    
    test("Factorial 5 = 120"){
        assert(factorialRecursive(5) == 120)
    }
    
    test("10110 => 22"){
        assert(binaryToDecimal("10110") == 22)
    }
    
    test("Reverse(Hallo) = ollaH"){
        assert(reverseString("Hallo") == "ollaH")
    }
    
    test(" 'Das ist\tein Test' = 4 "){
        assert(countWords("Das ist\tein Test") == 4)
    }
    
    test(" 'Das\nist\nein\nTest' = 4 "){
        assert(countWords("Das\nist\nein\nTest") == 4)
    }
    
    test("rentner isPalindrom true"){
        assert(isPalindromeOne("rentner") && isPalindromeTwo("rentner"))
    }
    
    test("hallo isPalindrom false"){
        assert(!(isPalindromeOne("hallo") || isPalindromeTwo("hallo")))
    }
    
    test("Fib(5) = 5"){
        assert(fibonacciRecursive(5) == 5)
    }
    
    test("Fib(0) = 1"){
        assert(fibonacciRecursive(0) == 1)
    }
    
    test("Not Prime 27 "){
        assert(!isPrime(27))
    }
    
    test("Prime 29 "){
        assert(isPrime(29))
    }
    
    test("CheckParenthesis '()' true"){
        assert(checkParenthesis("()"))
    }
    
    test("CheckParenthesis ')(' true"){
        assert(!checkParenthesis(")("))
    }
    
    test("CheckParenthesis '(())()' true"){
        assert(checkParenthesis("(())()"))
    }
    
    test("CheckParenthesis '(()))()' false"){
        assert(!checkParenthesis("(()))()"))
    }
    
    test("CheckParenthesis '(foo)(bar())' true"){
        assert(checkParenthesis("(foo)(bar())"))
    }
    
    test("CheckParenthesis '(foo))((bar()' false"){
        assert(!checkParenthesis("(foo))((bar()"))
    }
    
    test("CheckParenthesis '(())' true"){
        assert(checkParenthesis("(())"))
    }

}

