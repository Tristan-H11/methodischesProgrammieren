package PracticeDataStructure.Lists

import org.scalatest.funsuite.AnyFunSuite

class LinkedListTest extends AnyFunSuite {
    
    test("empty") {
        assert(new LinkedList[Int]().isEmpty)
    }
    
    test("not empty") {
        assert(!(new LinkedList[String]("Test").isEmpty))
    }
    
    test("add one and size=1") {
        assert(new LinkedList[String]("Test").length == 1)
    }
    
    test("Get index 3") {
        val list: LinkedList[Int] = new LinkedList[Int](1).add(2).add(3).add(4)
        assert(list.get(3) == 4 && 4 == list(3))
    }
    
    test("append all test") {
        val list1: LinkedList[Int] = new LinkedList[Int](1).add(2).add(3).add(4) //1,2,3,4
        val list2: LinkedList[Int] = new LinkedList[Int](2).add(4) //2,4
        assert(list1.addAll(list2).length == 6)
        assert(list1.iterator.sameElements(new LinkedList[Int](1).add(2).add(3).add(4).add(2).add(4)))
    }
    
    
//    test("remove 2 from 1,2,3"){
//        val list1 = new LinkedList[Int]().add(1).add(2).add(3)
//        list1.remove(2)
//        assert(list1 == new LinkedList[Int](1).add(2))
//    }
}

