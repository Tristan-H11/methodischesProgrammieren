package PracticeFunctional

import PracticeDataStructure.Mathematical.Point
import PracticeFunctional.FunctionalProgramming._
import org.scalatest.funsuite.AnyFunSuite

class FunctionalProgrammingTest extends AnyFunSuite {
    
    def compareReverse(a: Int, b: Int): Boolean = a < b
    
    def compareEquals(a: Int, b: Int): Boolean = a == b
    
    test("testAverageDistanceToOrigin") {
        val list1: List[Point] = List(Point(1, 1), Point(0, 2))
        assert(averageDistanceToOrigin(list1) - Math.sqrt(2) - 2 < 0.0001)
        val list2: List[Point] = List(Point(1, 1), Point())
        assert(averageDistanceToOrigin(list2) - Math.sqrt(2) < 0.0001)
    }
    
    test("testContainsPrime") {
        val list1: List[Int] = List(4, 6, 8, 10)
        val list2: List[Int] = List(4, 6, 7, 8)
        
        assert(!containsPrime(list1))
        assert(containsPrime(list2))
    }
    
    test("bubble (1,2,4,3) reverse") {
        assert(functionalBubbleSort(Array(1, 2, 4, 3), compareReverse) sameElements Array(4, 3, 2, 1))
    }
    test("bubble (1,2,2,3) equals") {
        assert(functionalBubbleSort(Array(1, 2, 2, 3), compareEquals) sameElements Array(1, 2, 2, 3))
    }
    test("bubble (1,2,3,4)") {
        assert(functionalBubbleSort(Array(1, 2, 4, 3)) sameElements Array(1, 2, 3, 4))
    }
    test("bubble ()") {
        assert(functionalBubbleSort(Array[Int]()) sameElements Array[Int]())
    }
    test("bubble (4,3,2,1)") {
        assert(functionalBubbleSort(Array(4, 3, 2, 1)) sameElements Array(1, 2, 3, 4))
    }
    test("bubble (4,3)") {
        assert(functionalBubbleSort(Array(4, 3)) sameElements Array(3, 4))
    }
    test("bubble (4)") {
        assert(functionalBubbleSort(Array(4)) sameElements Array(4))
    }
}
