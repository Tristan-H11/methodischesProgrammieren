package PracticeDataStructure.Lists

class DoubleLinkedList {
    var head: DoublyNode = _
    var tail: DoublyNode = _
    
    def add(item: Int): Unit = {
        val newNode: DoublyNode = new DoublyNode(item)
        if (head == null) {
            head = newNode
            tail = newNode
            
            head.prev = null
            tail.next = null
        }
        else {
            tail.next = newNode
            newNode.prev = tail
            tail = newNode
            tail.next = null
        }
    }
    
    def add(item: Int, index: Int): Unit = {
        var indexNode: DoublyNode = head
        var next: DoublyNode = indexNode.next
        val newNode: DoublyNode = new DoublyNode(item)
        for (_ <- 0 to index){
            if(indexNode == null)
                throw new IndexOutOfBoundsException
            
            indexNode = next
            next = next.next
        }
        indexNode.next = newNode
        next.prev = newNode
        newNode.prev = indexNode
        newNode.next = next
    }
}

sealed class DoublyNode(item: Int) {
    var prev: DoublyNode = _
    var next: DoublyNode = _
}