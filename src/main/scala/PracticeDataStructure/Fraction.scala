package PracticeDataStructure

case class Fraction(numerator: Int, denominator: Int) {
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar that should be added.
     */
    def add(scalar: Int): Fraction = {
        Fraction(numerator + scalar * denominator, denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction that should be added.
     */
    def add(frac: Fraction): Fraction = {
        Fraction(numerator * frac.denominator + denominator * frac.numerator,
            denominator * frac.denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar that should be subtracted.
     */
    def subtract(scalar: Int): Fraction = {
        Fraction(numerator - scalar * denominator, denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction that should be subtracted.
     */
    def subtract(frac: Fraction): Fraction = {
        Fraction(numerator * frac.denominator - denominator * frac.numerator,
            denominator * frac.denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar the fraction should be multiplied with.
     */
    def multiply(scalar: Int): Fraction = {
        Fraction(numerator * scalar, denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction the fraction should be multiplied with.
     */
    def multiply(frac: Fraction): Fraction = {
        Fraction(numerator * frac.numerator, denominator * frac.denominator)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param scalar Scalar the fraction should be divide by.
     */
    def divide(scalar: Int): Fraction = {
        Fraction(numerator, denominator * scalar)
    }
    
    /**
     * Returns a new fraction object with the resulting value.
     *
     * @param frac Fraction the fraction should be divide by.
     */
    def divide(frac: Fraction): Fraction = {
        Fraction(numerator * frac.denominator, denominator * frac.numerator)
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
        obj.isInstanceOf[Fraction] &&
            obj.asInstanceOf[Fraction].numerator == numerator &&
            obj.asInstanceOf[Fraction].denominator == denominator
    }
    
    /**
     * Checks if the fractions have identical numerators and denominators.
     */
    def equalsIgnoreValue(frac: Fraction): Boolean = {
        numerator == frac.numerator && denominator == frac.denominator
    }
    
    /**
     * Checks if the values represented are equal.
     */
    def equalsWithValue(frac: Fraction): Boolean = {
        val epsilon: Double = 0.0000001
        Math.abs(toDouble - frac.toDouble) < epsilon
    }
}
