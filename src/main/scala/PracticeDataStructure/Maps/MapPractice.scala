package PracticeDataStructure.Maps

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object MapPractice {
    def multiplicationTable: mutable.HashMap[Int, List[Int]] = {
        val map: mutable.HashMap[Int, List[Int]] = new mutable.HashMap[Int, List[Int]]()
        
        for (i <- 1 to 10) {
            val list: ListBuffer[Int] = new ListBuffer[Int]
            for (j <- 1 to 10) {
                list.addOne(i * j)
            }
            map.put(i, list.toList)
        }
        map
    }
    
    def toHundredWithoutMultiplicationTable(values: List[Int]): List[Int] = {
        if (values.forall(e => !(1 to 10).contains(e))) {
            throw new IllegalArgumentException
        }
        
        val multTable: mutable.HashMap[Int, List[Int]] = multiplicationTable
        val selectedTable: mutable.HashMap[Int, List[Int]] = new mutable.HashMap[Int, List[Int]]()
        values.foreach(e => {
            selectedTable.put(e, multTable(e))
        })
        
        val map: Set[Int] = selectedTable.values.toList.flatten.toSet
        val result: ListBuffer[Int] = new ListBuffer[Int]
        for (i <- 1 to 100) {
            if (!map.contains(i)) {
                result.addOne(i)
            }
        }
        result.toList
    }
}
