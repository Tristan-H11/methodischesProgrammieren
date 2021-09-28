package helloWorld

import org.scalatest.funsuite.AnyFunSuite

class HelloWorldTest extends AnyFunSuite {
    test("\"Hello World\" should be returned correct.") {
        assert(HelloWorld.getHelloWorld == "Hello World!")
    }
}
