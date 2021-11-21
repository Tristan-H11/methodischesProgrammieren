package PracticeDataStructure.LifoFifo

import java.util.EmptyStackException
import scala.collection.mutable.ListBuffer

class OwnStack[A] {
    private val values: ListBuffer[A] = ListBuffer[A]()
    
    def push(item: A): OwnStack[A] = {
        values.addOne(item)
        this
    }
    
    def pop(): A = {
        if(values.isEmpty)
            throw new EmptyStackException
        values.remove(values.size - 1)
    }
}
