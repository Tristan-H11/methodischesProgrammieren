package PracticeDataStructure.LifoFifo

import java.util.EmptyStackException
import PracticeDataStructure.Lists.LinkedList

class OwnStack[A] {
    private val values: LinkedList[A] = new LinkedList[A]()
    
    def push(item: A): OwnStack[A] = {
        values.add(item)
        this
    }
    
    def peek: A = {
        values.get(values.length -1)
    }
    
//    def pop(): A = {
//        if(values.isEmpty)
//            throw new EmptyStackException
//        values.remove(values.length - 1)
//    }
    
    def isEmpty: Boolean = {
        values.isEmpty
    }
}
