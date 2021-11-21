package PracticeDataStructure.Mathematical

import org.scalatest.funsuite.AnyFunSuite

class TriangleTest extends AnyFunSuite{
    
    val t1: Triangle = Triangle(Point(),Point(1,1), Point(0,2))
    val t2: Triangle = Triangle(Point(),Point(), Point())
    
    test("Area1"){
        assert(Math.abs(t1.area() - 1.0) < .00001)
    }
    test("Perimeter1"){
        assert(Math.abs(t1.perimeter() - (2+2*Math.sqrt(2))) < .00000001)
    }
    test("LengthOfSides1"){
        assert(t1.lengthOfSides() == (Math.sqrt(2), 2.0, Math.sqrt(2)))
    }
    
    test("Area2"){
        assert(t2.area() < .00001)
    }
    test("Perimeter2"){
        assert(t2.perimeter() < .00001)
    }
    test("LengthOfSides2"){
        assert(t2.lengthOfSides() == (0.0, 0.0, 0.0))
    }
}
