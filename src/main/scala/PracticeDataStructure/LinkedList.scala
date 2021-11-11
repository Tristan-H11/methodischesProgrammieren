package PracticeDataStructure

class LinkedList[A](head: A) {
    
    private val firstNode: Node[A] = new Node[A](head)
    
    def isEmpty: Boolean = {
        firstNode == null
    }
    
    def add(item: A): Unit = {
        var node = firstNode
        var next = firstNode.next
        while (next != null) {
            node = next
            next = node.next
        }
        node.next = new Node[A](item)
    }
    
    def size: Int = {
        var node = firstNode
        if(node == null) return 0
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
        if ( index >= size) throw new IndexOutOfBoundsException
        var node = firstNode
        var nextNode = node.next
        for (_ <- 1 to index) {
            node = nextNode
            nextNode = node.next
        }
        node.value
    }
    
}

sealed class Node[A](var value: A, var next: Node[A] = null) {}
