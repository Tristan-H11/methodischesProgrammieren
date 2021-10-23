package PracticeOne

import PracticeOne.checkParenthesis
import org.scalatest.funsuite.AnyFunSuite

class PracticeOneTest extends AnyFunSuite {
    test("SumAllNotDivisible 7,3 = 19") {
        assert(PracticeOne.sumAllNotDivisible(7, 3) == 19)
    }
    
    test("square 4 = 16") {
        assert(PracticeOne.square(4) == 16)
    }
    
    test("max 2<4") {
        assert(PracticeOne.max(2, 4) == 4)
    }
    
    test("max 2==2") {
        assert(PracticeOne.max(2, 2) == 2)
    }
    
    test("abs(-1)=1") {
        assert(PracticeOne.abs(-1) == 1)
    }
    
    test("abs(1)=1") {
        assert(PracticeOne.abs(1) == 1)
    }
    
    test("3 mod 2 = 1") {
        assert(PracticeOne.modulo(3, 2) == 3 % 2)
    }
    
    test("factorial") {
        assert(PracticeOne.factorial(20) == 2432902008176640000L)
    }
    
    test("No intersection with coefficients because of parallel lines") {
        assert(PracticeOne.intersectionWithCoefficient(2, 1, 2, 0) == "The lines are parallel.")
    }
    
    test("Intersection with coefficients in 0, 0") {
        assert(PracticeOne.intersectionWithCoefficient(-1, 0, 1, 0) == "<0.0>, <0.0>")
    }
    
    test("Intersection with coefficients in -0.2, -1.4 with FLP-Error") {
        assert(PracticeOne.intersectionWithCoefficient(17, 2, 2, -1) == "<-0.2>, <-1.4000000000000004>")
    }
    
    test("No intersection with points because of parallel lines") {
        assert(PracticeOne.intersectionWithPoints((-1, 0), (1, 0), (-1, 1), (1, 1)) == "The lines are parallel.")
    }
    
    test("Intersection with points in -3, -7") {
        assert(PracticeOne.intersectionWithPoints((-3, -7), (0, 2), (-3, -7), (0, -1)) == "<-3.0>, <-7.0>")
    }
    
    test("binaryToDecimal 10100=20") {
        assert(PracticeOne.binaryToDecimal(10100) == 20)
    }
    
    test("binaryToDecimal 0=0") {
        assert(PracticeOne.binaryToDecimal(10100) == 20)
    }
    
    test("binaryToDecimalFromString \"10100\"=20") {
        assert(PracticeOne.binaryToDecimal("10100") == 20)
    }
    
    test("binaryToDecimalFromString \"0\"=0") {
        assert(PracticeOne.binaryToDecimal("0") == 0)
    }
    
    test("Revert String to gnirtS") {
        assert(PracticeOne.reverseString("String") == "gnirtS")
    }
    
    test("Count in \"Das ist ein Test\" = 4") {
        assert(PracticeOne.countWords("Das\nist ein Test") == 4)
    }
    
    test("if () = true "){
        assert(checkParenthesis("()") )
    }
    test("if ()) = false "){
        assert(!checkParenthesis("())") )
    }
    test("if (()) = true "){
        assert(checkParenthesis("(())") )
    }
    test("if ((()) = false "){
        assert(!checkParenthesis("((())") )
    }
    
}
