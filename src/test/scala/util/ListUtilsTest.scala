package util

import org.scalatest.funsuite.AnyFunSuite

class ListUtilsTest extends AnyFunSuite{
    test("appendAll List of Lists"){
        val list1: List[List[Int]] = List(List(1,2),List(3,4,5))
        assert(ListUtils.flatten(list1) == List(1, 2, 3, 4, 5))
    }
    test("appendAll List of empty"){
        val list1: List[List[Int]] = List(List(),List())
        assert(ListUtils.flatten(list1) == List())
    }
}
