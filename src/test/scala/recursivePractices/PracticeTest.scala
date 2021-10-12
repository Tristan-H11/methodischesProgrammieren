package recursivePractices

import org.scalatest.funsuite.AnyFunSuite
import recursivePractices.Practice._

class PracticeTest extends AnyFunSuite {
    
    test("Sum of numbers to 4") {
        assert(sum(4) == 10)
    }
    
    test("Sum of numbers to 1") {
        assert(sum(1) == 1)
    }
    
    test("Sum of numbers to 0") {
        assert(sum(0) == 0)
    }
}
