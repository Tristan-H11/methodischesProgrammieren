package util

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object ListUtils {
    
    def flatten(list: List[List[Int]]): List[Int] = {
        val result: mutable.ListBuffer[Int] = ListBuffer()
        list.foreach(e => result.addAll(e))
        result.toList
    }
    
    

}