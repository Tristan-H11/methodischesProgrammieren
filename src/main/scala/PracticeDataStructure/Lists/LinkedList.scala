package PracticeDataStructure.Lists

import scala.collection.{AbstractIterator, immutable}

class LinkedList[A]() extends immutable.Iterable[A] {
    self =>
    private var firstNode: Node[A] = _
    
    def this(value: A = null) {
        this()
        firstNode = if (value != null) new Node[A](value) else null
    }
    
    
    override def isEmpty: Boolean = {
        firstNode == null
    }
    
    def add(item: A): LinkedList[A] = {
        if (firstNode == null)
            firstNode = new Node(item)
        var node = firstNode
        var next = firstNode.next
        while (next != null) {
            node = next
            next = node.next
        }
        node.next = new Node[A](item)
        this
    }
    
    def length: Int = {
        var node = firstNode
        if (node == null) return 0
        var next = firstNode.next
        var count: Int = 1
        while (next != null) {
            node = next
            next = node.next
            count += 1
        }
        count
    }
    
    def get(index: Int): A = {
        getNode(index).value
    }
    
    private def getNode(index: Int): Node[A] = {
        if (index >= length) throw new IndexOutOfBoundsException
        var node = firstNode
        var nextNode = node.next
        for (_ <- 1 to index) {
            node = nextNode
            nextNode = node.next
        }
        node
    }
    
    def addAll(list: LinkedList[A]): LinkedList[A] = {
        list.foreach(add)
        this
        //        for(i <- list){
        //            add(i)
        //        }
    }
    
    def iterator: Iterator[A] = new AbstractIterator[A] {
        private var position: Int = 0
        
        def hasNext: Boolean = position < self.length
        
        def next(): A = {
            val value: A = get(position)
            position += 1
            value
        }
        
        override def sameElements[B >: A](that: IterableOnce[B]): Boolean = super.sameElements(that)
    }
    
    def apply(i: Int): A = get(i)
}

sealed class Node[A](var value: A, var next: Node[A] = null) {}
