package firstPractice

import org.scalatest.funsuite.AnyFunSuite

class PracticeTest extends AnyFunSuite {
    test("SumAllNotDivisible 7,3 = 19") {
        assert(practice.sumAllNotDivisible(7, 3) == 19)
    }

    test("factorial"){
        assert(Practice.factorial(20) == 2432902008176640000L )
    }

    test("binaryToDecimal 10100=20"){
        assert(Practice.binaryToDecimal(10100) == 20)
    }

    test("binaryToDecimalFromString \"10100\"=20"){
        assert(Practice.binaryToDecimalFromString("10100") == 20)
    }

    test("Revert String to gnirtS"){
        assert(Practice.reverseString("String").equals("gnirtS"))
    }

    test("Count in \"Das ist ein Test\" = 4"){
        assert(Practice.countWords("Das ist ein Test") == 4)
    }
}
