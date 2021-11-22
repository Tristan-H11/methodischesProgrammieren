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
    
    def mergeSort(a: Array[Int]): Array[Int] = {
        if (a.length <= 1) {
            a
        } else {
            val (left, right) = a.splitAt(a.length / 2)
            merge(mergeSort(left), mergeSort(right))
        }
    }
    
    def merge(left: Array[Int], right: Array[Int]): Array[Int] = {
        val newA = Array.ofDim[Int](left.length + right.length)
        var indexLeft = 0
        var indexRight = 0
        var i = 0
        while (indexLeft < left.length && indexRight < right.length) {
            if (left(indexLeft) <= right(indexRight)) {
                newA(i) = left(indexLeft)
                indexLeft += 1
            } else {
                newA(i) = right(indexRight)
                indexRight += 1
            }
            i += 1
        }
        while (indexLeft < left.length) {
            newA(i) = left(indexLeft)
            indexLeft += 1
            i += 1
        }
        while (indexRight < right.length) {
            newA(i) = right(indexRight)
            indexRight += 1
            i += 1
        }
        newA
    }
}
