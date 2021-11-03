package Practice3

import scala.annotation.tailrec

object PracticeThree {
    
    /*
    Task 1
    */
    def glueArray(array: Array[Any], glue: String = " ,"): String = {
        if (array.length == 1) return array(0).toString
        if (array.isEmpty) return ""
        val result: StringBuilder = new StringBuilder
        for (i <- 0 until array.length - 1) {
            result.append(array(i) + glue)
        }
        result.append(array(array.length - 1))
        result.toString()
    }
    
    /*
    Task 2 mit Annahme eines Int Arrays
     */
    def sameElementsOwn(array1: Array[Int], array2: Array[Int]): Boolean = {
        if (array1.length != array2.length) return false
        for (i <- array1.indices) {
            if (array1(i) != array2(i))
                return false
        }
        true
    }
    
    /*
    Task 3
     */
    def sumOf(a: Array[Int]): Int = {
        var result: Int = 0
        for (element <- a) {
            result += element
        }
        result
    }
    
    @tailrec
    def sumOfRec(a: Array[Int], result: Int = 0): Int = {
        val head: Int = a(0)
        if (a.length == 1) {
            head + result
        } else {
            sumOfRec(a.drop(1), result + head)
        }
    }
    
    /*
    Task 4 mit aufsteigender Sortierung angenommen
     */
    def isSorted(a: Array[Int]): Boolean = {
        sameElementsOwn(quickSort(a), a)
    }
    
    /*
    Task 5
     */
    
    /**
     * Laufzeit für a.length = n
     */
    def equalsButSorted(a: Array[Int], b: Array[Int]): Boolean = {
        isSorted(a) && sumOf(a) == sumOf(b)
        // O(n log n)    O(n)         O(n)
        // ==> O(n log n)
    }
    
    /*
    Task 6
    
    Die swap-Methode ist keine pure Funktion, weil sie ein bestehendes Objekt manipuliert (Seiteneffekt),
    statt es zurückzugeben.
    Definition:
    Als pure Funktion bezeichnet man eine Funktion, deren Rückgabewert ausschließlich
    von ihren Argumenten abhängt und die keine Nebenwirkungen entfaltet.
     */
    
    
    /*
    Task 7
    1000 \in O(1), weil beide horizontal liegen und damit gleich schnell wachsen. c=1000, n_0=alles
    20n+10 \in O(n), weil konstante Summanden wegfallen. c=20, n=2
    10n^2 +5 \in O(n^2), c=10
     */
    
    
    /*
    Task 10
     */
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
}









