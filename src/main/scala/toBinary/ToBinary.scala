package toBinary

import scala.collection.mutable.ListBuffer

/**
 * Singleton for converting Integers from decimal to binary.
 */
object ToBinary {

    /**
     * Converts a given Integer from decimal to binary.
     */
    def convert(input: Int): String = {
        val binary = ListBuffer[Int]()

        var number = if( input < 0)
            {Math.abs(input + 1)}
            else input

        while (number / 2 != 0) {
            binary.insert(0, number % 2)
            number /= 2
        }
        binary.insert(0, if (number == 1) 1 else 0)
        binary.mkString("")
    }
}
