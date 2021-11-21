package PracticeDataStructure.LifoFifo

import scala.collection.mutable.ListBuffer

class OwnQueue[A] {
    private val values: ListBuffer[A] = ListBuffer[A]()
    
    def push(item: A): OwnQueue[A] = {
        values.addOne(item)
        this
    }
    
    def pop(): A = {
        if(values.isEmpty)
            throw new IndexOutOfBoundsException
        values.remove(0)
    }
}
