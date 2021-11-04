package PracticeAlgorithms

object SortingAlgorithms {
   
    def bubbleSort(unsortedArray: Array[Int]): Array[Int] = {
        if (unsortedArray.length < 2) return unsortedArray
        
        val arrayToSort = unsortedArray.clone()
        for (i <- arrayToSort.indices;
             j <- 0 until arrayToSort.length - 1 - i) {
            if (arrayToSort(j) > arrayToSort(j + 1)) {
                val mem: Int = arrayToSort(j)
                arrayToSort(j) = arrayToSort(j + 1)
                arrayToSort(j + 1) = mem
            }
        }
        arrayToSort
    }
    
    def quickSort(arrayToSort: Array[Int]): Array[Int] = {
        if (arrayToSort.length <= 1) {
            arrayToSort
        }
        else {
            val pivot = arrayToSort(arrayToSort.length / 2)
            Array.concat(
                quickSort(arrayToSort.filter(pivot > _)),
                arrayToSort.filter(pivot == _),
                quickSort(arrayToSort.filter(pivot < _)))
        }
    }
    
//    def mergeSort(arrayToSort: Array[Int]): Array[Int]={
//        if(arrayToSort.length < 2) return arrayToSort
//
//
//    }
}
