package PracticeDataStructure

import org.scalatest.funsuite.AnyFunSuite

class FractionTest extends AnyFunSuite {
    
    val frac: Fraction = Fraction(2, 4)
    val epsilon: Double = 0.0000001
    
    test("NumberFormatException for 1/0"){
        assertThrows[NumberFormatException]{
            Fraction(1,0)
        }
    }
    
    test("Add 0 to 2/4") {
        assert(frac.add(0) equals Fraction(2, 4))
    }
    test("Add 2 to 2/4") {
        assert(frac.add(2) equals Fraction(10, 4))
    }
    test("Add 2/4 to 2/4") {
        assert(frac.add(Fraction(2,4)) equalInValue Fraction(1))
    }
    
    test("Sub 0 from 2/4") {
        assert(frac.subtract(0) equals Fraction(2, 4))
    }
    test("Sub 2 from 2/4") {
        assert(frac.subtract(2) equals Fraction(-6, 4))
    }
    test("Sub 2/4 from 2/4") {
        assert(frac.subtract(Fraction(2,4)) equalInValue Fraction(0))
    }
    
    test("Multiply 2/4 with 0"){
        assert(frac.multiply(0) equalInValue 0)
    }
    test("Multiply 2/4 with 2/4"){
        assert(frac.multiply(Fraction(2,4)) equalInValue Fraction(1,4))
    }
    test("Multiply 2/4 with 2/2"){
        assert(frac.multiply(Fraction(2,2)) equalInValue Fraction(2,4))
    }
    
    test("Divide 2/4 by 1/2"){
        assert(frac.divide(Fraction(1,2)) equalInValue 1)
    }
    test("Divide 2/4 by 2"){
        assert(frac.divide(2) equalInValue Fraction(2,8))
    }
    test("Division by zero exception"){
        assertThrows[UnsupportedOperationException]{
            frac.divide(0)
        }
        assertThrows[UnsupportedOperationException]{
            frac.divide(Fraction(0))
        }
    }
    
    test("2/4 toDouble is 0.5"){
        assert(frac.toDouble - 0.5 < epsilon)
    }
    test("2/4 toFloat is 0.5"){
        assert(frac.toFloat - 0.5 < epsilon)
    }
    test("FPE-Test: 1/10 + 2/10 = 3/10"){
        assert(Fraction(1,10) add Fraction(1,5) equalInValue Fraction(3,10))
    }
    
    test("2/4 toString gives '2/4' "){
        assert(frac.toString == "2/4")
    }
    test("2/4 equal in Num and Den 2/4"){
        assert(frac equalInNumDen Fraction(2,4))
    }
    test("2/4 not equal in Num and Den 1/2"){
        assert(!frac.equalInNumDen(Fraction(1,2)))
    }
    
    test("Equal in value overloading"){
        val frac2 = Fraction(6,3)
        assert(frac2.equalInValue(2) == frac2.equalInValue(Fraction(8,4)))
    }
 }
