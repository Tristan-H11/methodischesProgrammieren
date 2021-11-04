package PracticeDataStructure

import org.scalatest.funsuite.AnyFunSuite

class FractionTest extends AnyFunSuite {
    
    val frac: Fraction = Fraction(2, 4)
    val epsilon: Double = 0.0000001
    
    test("NumberFormatException for 1/0") {
        assertThrows[NumberFormatException] {
            Fraction(1, 0)
        }
    }
    
    test("Add 0 to 2/4") {
        assert(frac.add(0) == Fraction(1, 2))
    }
    test("Add 2 to 2/4") {
        assert(frac.add(2) equals Fraction(5, 2))
    }
    test("Add 2/4 to 2/4") {
        assert(frac.add(Fraction(2, 4)) equals Fraction(1))
    }
    test("Overflow addition") {
        assertThrows[ArithmeticException] {
            Fraction(Integer.MAX_VALUE).add(Fraction(Integer.MAX_VALUE, 2))
        }
        assertThrows[ArithmeticException] {
            /*
            Der darf eigentlich nicht werfen!!
            */
            Fraction(1, Integer.MAX_VALUE)
                .add(Fraction(Integer.MAX_VALUE, 2)) == Fraction(Integer.MAX_VALUE, Integer.MAX_VALUE * 2)
        }
    }
    
    test("Sub 0 from 2/4") {
        assert(frac.subtract(0) equals Fraction(1, 2))
    }
    test("Sub 2 from 2/4") {
        assert(frac.subtract(2).toDouble == -1.5)
    }
    test("Sub 2/4 from 2/4") {
        assert(frac.subtract(Fraction(2, 4)) equals Fraction(0))
    }
    test("No overflow subtraction") {
        assert(Fraction(Integer.MAX_VALUE).subtract(Integer.MAX_VALUE) == Fraction(0))
    }
    
    test("Multiply 2/4 with 0") {
        assert(frac.multiply(0) equals 0)
    }
    test("Multiply 2/4 with 2/4") {
        assert(frac.multiply(Fraction(2, 4)) == Fraction(2, 8))
    }
    test("Multiply 2/4 with 2/2") {
        assert(frac.multiply(Fraction(2, 2)) equals Fraction(1, 2))
    }
    test("Overflow multiplication") {
        assertThrows[ArithmeticException] {
            Fraction(Integer.MAX_VALUE).multiply(Fraction(Integer.MAX_VALUE, 2))
        }
        assertThrows[ArithmeticException] {
            /*
            Sollte eigentlich auch nicht werfen!!
             */
            Fraction(1, Integer.MAX_VALUE)
                .multiply(Fraction(Integer.MAX_VALUE, 2)) == Fraction(1, 2)
        }
    }
    
    test("Divide 2/4 by 1/2") {
        assert(frac.divide(Fraction(1, 2)) equals 1)
    }
    test("Divide 2/4 by 2") {
        assert(frac.divide(2) equals Fraction(1, 4))
    }
    test("Division by zero exception") {
        assertThrows[ArithmeticException] {
            frac.divide(0)
        }
        assertThrows[ArithmeticException] {
            frac.divide(Fraction(0))
        }
    }
    
    test("2/4 toDouble is 0.5") {
        assert(frac.toDouble - 0.5 < epsilon)
    }
    test("2/4 toFloat is 0.5") {
        assert(frac.toFloat - 0.5 < epsilon)
    }
    test("FPE-Test: 1/10 + 2/10 = 3/10") {
        assert(Fraction(1, 10) add Fraction(1, 5) equals Fraction(3, 10))
    }
    
    test("2/4 toString gives '1/2' ") {
        assert(frac.toString == "1/2")
    }
    test("2/4 equal 2/4") {
        assert(frac equals Fraction(2, 4))
    }
    test("2/4 equal 1/2") {
        assert(frac.equals(Fraction(1, 2)))
    }
    
    test("Equal in value overloading") {
        val frac2 = Fraction(6, 3)
        assert(frac2.equals(2) == frac2.equals(Fraction(8, 4)))
    }
    test("Equals as object") {
        assert(frac.equals(Fraction(2, 4)))
        assert(frac.equals(Fraction(1, 2)))
    }
}
