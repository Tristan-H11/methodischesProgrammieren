package firstPractice

object Practice {

  /*
  Write a method to sum up all values 0..x not divisible by y
   */
  def sumAllNotDivisible(x: Int, y: Int): Int = {
    (0 to x).filter(e => e % y != 0).sum
  }

  /*
  Task 1
   */
  val constant: Int = 7

  /*
  Task 2
   */
  def square(x: Double): Double = {
    Math.pow(x, 2)
  }

  /*
  Task 3
   */
  def max(x: Double, y: Double): Double = {
    if (x >= y) x else y
  }

  /*
  Task 4
   */
  def abs(x: Double): Double = {
    if (x < 0) -x else x
  }

  /*
  Task 5
   */
  def modulo(x: Int, divisor: Int): Int = {
    x - divisor * (x / divisor)
  }

  /*
  Task 6
   */
  def factorial(number: Int): Long = {
    var product: Long = 1L
    (1 to number).foreach(e => product *= e)
    product
  }

  /*
  Task 7
   */
  def intersectionWithCoefficient(a1: Double, b1: Double, a2: Double, b2: Double): String = {
    if (a2 - a1 != 0) {
      val x = 0.0 + (b2 - b1) / (a1 - a2) //Adding 0.0 to manage -0.0
      val y = a1 * x + b1
      s"<$x>, <$y>"
    } else {
      "The lines are parallel."
    }
  }

  def intersectionWithPoints(pointOneA: (Double, Double), pointOneB: (Double, Double),
                             pointTwoA: (Double, Double), pointTwoB: (Double, Double)): String = {

    val a1: Double = (pointOneB._2 - pointOneA._2) / (pointOneB._1 - pointOneA._1)
    val b1: Double = pointOneA._2 - (a1 * pointOneA._1)

    val a2: Double = (pointTwoB._2 - pointTwoA._2) / (pointTwoB._1 - pointTwoA._1)
    val b2: Double = pointTwoA._2 - (a2 * pointTwoA._1)

    intersectionWithCoefficient(a1, b1, a2, b2)
  }

  /*
  Task 8
   */
  def binaryToDecimal(number: Long): Int = {
    Integer.parseInt(number.toString, 2)

//    var result: Long = 0
//
//    // Imitates 2^n. Is doubled after every while-iteration.
//    var base: Long = 1
//
//    var temp: Long = number
//    while (temp > 0) {
//      val last_digit: Long = temp % 10
//      temp /= 10
//      result += last_digit * base
//      base *= 2
//    }
//    result.toInt
  }

  def binaryToDecimalFromString(number: String): Int = {
    binaryToDecimal(number.toLong)

//    val length: Int = number.length - 1
//    var result: Int = 0
//    for (x <- 1 to length) {
//      result += (number.charAt(length - x ).asDigit * Math.pow(2, x)).toInt
//    }
//    result
  }

  /*
  Task 9
   */
  def reverseString(text: String): String = {
    text.reverse.mkString
  }

  /*
  Task 10
   */
  def countWords(sentence: String): Int = {
    sentence.split(" ").length
  }
}
