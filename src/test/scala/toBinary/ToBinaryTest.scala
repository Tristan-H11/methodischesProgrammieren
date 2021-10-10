package toBinary

import org.scalatest.funsuite.AnyFunSuite

class ToBinaryTest extends AnyFunSuite {
    test("Input 0") {
        assert(ToBinary.convert(0) == "0")
    }
    
    test("Input 1") {
        assert(ToBinary.convert(1) == "1")
    }
    
    test("Input 20") {
        assert(ToBinary.convert(20) == "10100")
    }
    
    test("Input " + Integer.MAX_VALUE) {
        assert(ToBinary.convert(Integer.MAX_VALUE) == "1111111111111111111111111111111")
    }
    
    test("Input -1") {
        assert(ToBinary.convert(-1) == "0")
    }
    
    test("Input -3") {
        assert(ToBinary.convert(-3) == "10")
    }
}
