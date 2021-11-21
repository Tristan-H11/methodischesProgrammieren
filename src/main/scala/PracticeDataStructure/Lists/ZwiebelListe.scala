//package PracticeDataStructure
//
//import scala.annotation.tailrec
//
//class ZwiebelListe(var head: Node = null) {
//
//    def add(i: Int): Unit = {
//        var node = head
//        var next = node.next
//        while (next != null) {
//            node = next
//            next = node.next
//        }
//        node.next = new Node(i)
//    }
//
//    def clear(): Unit = head = null
//
//    def contains(value: Int): Boolean = !isEmpty && head.contains(value)
//
//    def isEmpty: Boolean = head == null
//
//    def prepend(value: Int): Unit = {
//        val oldHead = head
//        head = new Node(value, oldHead)
//    }
//
//    def size(): Int = if (isEmpty) 0 else head.size(1)
//
//    override def toString: String = "[" + (if (head != null) head else "") + "]"
//
//    def first: Int = if (head != null) head.value else null
//
//    def get(index: Int): Int = {
//        if ( index >= size) throw new IndexOutOfBoundsException
//        var node = head
//        var nextNode = node.next
//        for (_ <- 1 to index) {
//            node = nextNode
//            nextNode = node.next
//        }
//        node.value
//    }
//
//    def indexOf(value: Int): Int = {
//        var node = head
//        var nextNode = node.next
//        var count: Int = 0
//        while (node.value != value) {
//            node = nextNode
//            nextNode = node.next
//            count += 1
//        }
//        count
//    }
//
//    def last: Int = {
//        get(size()-1)
//    }
//
//    def lastIndexOf(value: Int): Int = {
//        var result: Int = -1
//        var position = head
//        for (i <- 0 until this.size()) {
//            if (position.value == value) {
//                result = i
//            } else {
//                position = position.next
//            }
//        }
//        result
//    }
//
//    def addAll(values: List[Int]): Unit = {
//        for (i <- values.indices)
//            this.add(values(i))
//    }
//}
//
//sealed class Node(var value: Int, var next: Node = null) {
//
//    @tailrec
//    final def contains(value: Int): Boolean = value == this.value || hasNext && next.contains(value)
//
//    def hasNext: Boolean = next != null
//
//    @tailrec
//    final def size(acc: Int): Int = if (hasNext) acc else next.size(acc + 1)
//
//    final override def toString: String = value + (if (hasNext) "," + next else "")
//}
