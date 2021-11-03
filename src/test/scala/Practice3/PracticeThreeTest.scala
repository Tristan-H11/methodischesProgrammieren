package Practice3

import PracticeThree._
import org.scalatest.funsuite.AnyFunSuite

class PracticeThreeTest extends AnyFunSuite {
    
    test("Glue=' ,' Array(1,2,3)"){
        assert(glueArray(Array(1,2,3)) == "1 ,2 ,3")
    }
    test("Glue=',' Array()"){
        assert(glueArray(Array()) == "")
    }
    test("Glue=',' Array(1)"){
        assert(glueArray(Array(1)) == "1")
    }
    
    test("Sameelements (1,2,3) (1,2,3)"){
        assert(sameElementsOwn(Array(1,2,3), Array(1,2,3)))
    }
    test("Sameelements () ()"){
        assert(sameElementsOwn(Array(), Array()))
    }
    
    test("SameElements (1,2,3) (2,3,4)"){
        assert(!sameElementsOwn(Array(1,2,3), Array(2,3,4)))
    }
    
    test("Array(1,2,3) = 6"){
        assert(sumOfRec(Array(1,2,3)) == 6 && sumOf(Array(1,2,3)) == 6)
    }
    test("Array(0) = 0"){
        assert(sumOfRec(Array(0)) == 0 && sumOf(Array(0)) == 0)
    }
    test("Array() = 0"){
        assert(sumOfRec(Array()) == 0 && sumOf(Array()) == 0)
    }
    
    test("isSorted Array(1,2,3)"){
        assert(isSorted(Array(1,2,3)))
    }
    test("isSorted Array(1,4,3)"){
        assert(!isSorted(Array(1,4,3)))
    }
    
    test("bubble (1,2,4,3)"){
        assert(bubbleSort(Array(1, 2, 4, 3)) sameElements Array(1, 2, 3, 4))
    }
    test("bubble (1,2,3,4)"){
        assert(bubbleSort(Array(1, 2, 4, 3)) sameElements Array(1, 2, 3, 4))
    }
    test("bubble ()"){
        assert(bubbleSort(Array[Int]()) sameElements Array[Int]())
    }
    test("bubble (4,3,2,1)"){
        assert(bubbleSort(Array(4,3,2,1)) sameElements Array(1,2,3,4))
    }
    test("bubble (4,3)"){
        assert(bubbleSort(Array(4,3)) sameElements Array(3,4))
    }
    test("bubble (4)"){
        assert(bubbleSort(Array(4)) sameElements Array(4))
    }
    
    test("quickSort (1,2,4,3)"){
        assert(quickSort(Array(1, 2, 4, 3)) sameElements Array(1, 2, 3, 4))
    }
    test("quickSort (1,2,3,4)"){
        assert(quickSort(Array(1, 2, 4, 3)) sameElements Array(1, 2, 3, 4))
    }
    test("quickSort ()"){
        assert(quickSort(Array[Int]()) sameElements Array[Int]())
    }
    test("quickSort (4,3,2,1)"){
        assert(quickSort(Array(4,3,2,1)) sameElements Array(1,2,3,4))
    }
    test("quickSort (4,3)"){
        assert(quickSort(Array(4,3)) sameElements Array(3,4))
    }
    test("quickSort (4)"){
        assert(quickSort(Array(4)) sameElements Array(4))
    }
    
    test("Array(1,2,3) equalsButSorted Array(2,1,3)"){
        assert(equalsButSorted(Array(1,2,3), Array(2,1,3)))
    }
}
