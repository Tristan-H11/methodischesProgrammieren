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
    
    test("Array(1,2,3) equalsButSorted Array(2,1,3)"){
        assert(equalsButSorted(Array(1,2,3), Array(2,1,3)))
    }
}
