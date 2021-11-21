package util

import org.scalatest.funsuite.AnyFunSuite
import ListUtils._

class ListUtilsTest extends AnyFunSuite{
    test("appendAll List of Lists"){
        val list1: List[List[Int]] = List(List(1,2),List(3,4,5))
        assert(flatten(list1) == List(1, 2, 3, 4, 5))
    }
    test("appendAll List of empty"){
        val list1: List[List[Int]] = List()
        assert(flatten(list1) == List())
    }
    
    test("getPrime 1,2,3,4,5,6,7,8,9"){
        val list: List[Int] = List.range(1,10)
        assert(getPrimes(list) == List(2,3,5,7))
    }
    
    
    test("getPrime ()"){
        val list: List[Int] = List()
        assert(getPrimes(list).isEmpty)
    }
}
