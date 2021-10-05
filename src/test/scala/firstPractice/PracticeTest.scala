package firstPractice

import org.scalatest.funsuite.AnyFunSuite

class PracticeTest extends AnyFunSuite {
    test("SumAllNotDivisible 7,3 = 19") {
        assert(Practice.sumAllNotDivisible(7, 3) == 19)
    }

    test("square 4 = 16"){
        assert(Practice.square(4) == 16)
    }

    test("max 2<4"){
        assert(Practice.max(2,4) == 4)
    }

    test("max 2==2"){
        assert(Practice.max(2,2)==2)
    }

    test("abs(-1)=1"){
        assert(Practice.abs(-1)==1)
    }

    test("abs(1)=1"){
        assert(Practice.abs(1)==1)
    }

    test("3 mod 2 = 1"){
        assert(Practice.modulo(3,2) == 3 % 2)
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
