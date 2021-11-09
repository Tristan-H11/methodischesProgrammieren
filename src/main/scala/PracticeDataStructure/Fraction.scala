package PracticeDataStructure

import PracticeAlgorithms.GreatestCommonDivisor

/*
Best practice:
https://codereview.stackexchange.com/questions/99211/scala-fraction-addition
Lowest common multiple wird nicht berücksichtigt. Brüche werden dirty verrechnet.
Entsprechend sind nicht alle Fälle eines Overflows abgedeckt
 */
case class Fraction(inputNumerator: Int, inputDenominator: Int = 1) {
    var numerator: Int = inputNumerator
    var denominator: Int = inputDenominator
    
    if (denominator == 0) {
        throw new NumberFormatException("Denominator may not be 0")
    }
    reduce()
    
    /**
     * Negates a fraction.
     *
     * @param frac Fraction that should be negated.
     */
    def negate(frac: Fraction): Fraction = {
        Fraction(-frac.numerator, frac.denominator)
    }
    
    /**
     * Returns the reciprocal of a fraction.
     * @param frac Fraction the reciprocal is wanted of.
     */
    def reciprocal(frac: Fraction): Fraction = {
        Fraction(frac.denominator, frac.numerator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar that should be added.
     */
    def add(scalar: Int): Fraction = {
        add(Fraction(scalar))
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction that should be added.
     */
    def add(frac: Fraction): Fraction = {
        if (frac.numerator == 0) return this
        val newNumerator = safeAdd(
            safeMultiply(numerator, frac.denominator),
            safeMultiply(denominator, frac.numerator))
        val newDenominator = safeMultiply(denominator, frac.denominator)
        Fraction(newNumerator, newDenominator)
    }
    
    /**
     * Adds two numbers and handles over- or underflow.
     */
    private def safeAdd(a: Int, b: Int): Int = {
        if (a > 0 && b > Integer.MAX_VALUE - a) {
            throw new ArithmeticException("Integer Overflow")
        } else if (a < 0 && b < Integer.MIN_VALUE - a) {
            throw new ArithmeticException("Integer Underflow")
        }
        a + b
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar that should be subtracted.
     */
    def subtract(scalar: Int): Fraction = {
        subtract(Fraction(scalar))
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction that should be subtracted.
     */
    def subtract(frac: Fraction): Fraction = {
        add(negate(frac))
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar the fraction should be multiplied with.
     */
    def multiply(scalar: Int): Fraction = {
        multiply(Fraction(scalar))
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction the fraction should be multiplied with.
     */
    def multiply(frac: Fraction): Fraction = {
        Fraction(safeMultiply(numerator, frac.numerator), safeMultiply(denominator, frac.denominator))
    }
    
    /**
     * Multiplies two numbers and handles overflow.
     */
    private def safeMultiply(a: Int, b: Int): Int = {
        val x: Long = a.toLong * b
        if (x > Integer.MAX_VALUE) {
            throw new ArithmeticException("Integer Overflow")
        } else {
            a * b
        }
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar the fraction should be divided by.
     */
    def divide(scalar: Int): Fraction = {
        if (scalar == 0) throw new ArithmeticException("Cannot divide by zero")
        divide(Fraction(scalar))
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction the fraction should be divided by.
     */
    def divide(frac: Fraction): Fraction = {
        if (frac.numerator == 0) throw new ArithmeticException("Cannot divide by zero")
        multiply(reciprocal(frac))
    }
    
    /**
     * Returns the fraction as double value.
     */
    def toDouble: Double = {
        numerator.toDouble / denominator
    }
    
    /**
     * Returns the fraction as float value.
     */
    def toFloat: Float = {
        numerator.toFloat / denominator
    }
    
    /**
     * Returns a string representation of the object.
     */
    override def toString: String = s"$numerator/$denominator"
    
    /**
     * Overrides equals and checks for same type and same numerator and same denominator.
     */
    override def equals(obj: Any): Boolean = {
        obj match {
            case fraction: Fraction =>
                fraction.numerator == numerator &&
                    fraction.denominator == denominator
            case _ => false
        }
    }
    
    /**
     * Checks if the represented values are equal.
     */
    def equals(scalar: Int): Boolean = {
        equals(Fraction(scalar))
    }
    
    private def reduce(): Unit = {
        val gcd: Int = GreatestCommonDivisor.gcd(inputNumerator, inputDenominator)
        if (gcd > 1) {
            numerator = inputNumerator / gcd
            denominator = inputDenominator / gcd
        }
    }
}
