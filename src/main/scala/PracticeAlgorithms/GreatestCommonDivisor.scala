package PracticeAlgorithms

import scala.annotation.tailrec

object GreatestCommonDivisor {
    @tailrec
    def gcd(x: Int, y: Int): Int ={
        if(y == 0)
            x
        else
            gcd(y, x % y)
    }
}
