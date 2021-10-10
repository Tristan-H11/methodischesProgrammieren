package firstPractice

import org.scalatest.funsuite.AnyFunSuite

class PracticeTest extends AnyFunSuite {
    test("SumAllNotDivisible 7,3 = 19") {
        assert(Practice.sumAllNotDivisible(7, 3) == 19)
    }
    
    test("square 4 = 16") {
        assert(Practice.square(4) == 16)
    }
    
    test("max 2<4") {
        assert(Practice.max(2, 4) == 4)
    }
    
    test("max 2==2") {
        assert(Practice.max(2, 2) == 2)
    }
    
    test("abs(-1)=1") {
        assert(Practice.abs(-1) == 1)
    }
    
    test("abs(1)=1") {
        assert(Practice.abs(1) == 1)
    }
    
    test("3 mod 2 = 1") {
        assert(Practice.modulo(3, 2) == 3 % 2)
    }
    
    test("factorial") {
        assert(Practice.factorial(20) == 2432902008176640000L)
    }
    
    test("No intersection with coefficients because of parallel lines") {
        assert(Practice.intersectionWithCoefficient(2, 1, 2, 0) == "The lines are parallel.")
    }
    
    test("Intersection with coefficients in 0, 0") {
        assert(Practice.intersectionWithCoefficient(-1, 0, 1, 0) == "<0.0>, <0.0>")
    }
    
    test("Intersection with coefficients in -0.2, -1.4 with FLP-Error") {
        assert(Practice.intersectionWithCoefficient(17, 2, 2, -1) == "<-0.2>, <-1.4000000000000004>")
    }
    
    test("No intersection with points because of parallel lines") {
        assert(Practice.intersectionWithPoints((-1, 0), (1, 0), (-1, 1), (1, 1)) == "The lines are parallel.")
    }
    
    test("Intersection with points in -3, -7") {
        assert(Practice.intersectionWithPoints((-3, -7), (0, 2), (-3, -7), (0, -1)) == "<-3.0>, <-7.0>")
    }
    
    test("binaryToDecimal 10100=20") {
        assert(Practice.binaryToDecimal(10100) == 20)
    }
    
    test("binaryToDecimal 0=0") {
        assert(Practice.binaryToDecimal(10100) == 20)
    }
    
    test("binaryToDecimalFromString \"10100\"=20") {
        assert(Practice.binaryToDecimalFromString("10100") == 20)
    }
    
    test("binaryToDecimalFromString \"0\"=0") {
        assert(Practice.binaryToDecimalFromString("0") == 0)
    }
    
    test("Revert String to gnirtS") {
        assert(Practice.reverseString("String") == "gnirtS")
    }
    
    test("Count in \"Das ist ein Test\" = 4") {
        assert(Practice.countWords("Das ist ein Test") == 4)
    }
}
