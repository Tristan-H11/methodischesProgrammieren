package PracticeDataStructure.Mathematical

import org.scalatest.funsuite.AnyFunSuite

class PointTest extends AnyFunSuite{
    test("Distance 0|0 to 3|4"){
        assert(Point().distance(Point(3,4)) == 5.0)
    }
    test("Distance 0|0 to -3|-4"){
        assert(Point().distance(Point(-3,-4)) == 5.0)
    }
    test("Distance 0|0 to 3|-4"){
        assert(Point().distance(Point(3,-4)) == 5.0)
    }
    test("Distance 0|0 to -3|4"){
        assert(Point().distance(Point(-3,4)) == 5.0)
    }
    
    test("Distance 1|1 to 4|5"){
        assert(Point(1,1).distance(Point(4,5)) == 5.0)
    }
    test("Distance 1|1 to -4|-5"){
        assert(Point(1,1).distance(Point(-2,-3)) == 5.0)
    }
    test("Distance 1|1 to 4|-5"){
        assert(Point(1,1).distance(Point(4,-3)) == 5.0)
    }
    test("Distance 1|1 to -4|5"){
        assert(Point(1,1).distance(Point(-2,5)) == 5.0)
    }
    
    test("on x-axis"){
        assert(Point(2).toString =="Point on x-axis at 2.0")
    }
    test("on y-axis"){
        assert(Point(0,2).toString =="Point on y-axis at 2.0")
    }
    test("on diagonal"){
        assert(Point(2,2).toString =="Point on diagonal at (2.0,2.0)")
    }
    test("other point"){
        assert(Point(2,3).toString =="Point(2.0,3.0)")
    }
}
