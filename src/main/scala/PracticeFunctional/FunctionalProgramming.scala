package PracticeFunctional

//Import für isPrime() aus der zweiten Hausaufgabe
import Practice2.PracticeTwo._
//Import für die Point-Klasse
import PracticeDataStructure.Mathematical.Point


object FunctionalProgramming {
    
    def containsPrime(values: List[Int]): Boolean = {
        //Schaut ob mindestens ein Element e in der Liste "values" existiert (exists),
        //für das isPrime(e) true liefert.
        values.exists(e => isPrime(e))
    }
    
    def averageDistanceToOrigin(points: List[Point]): Double = {
        //Summiert die Distanzen aller Punkte und berechnet den Durchschnitt
        //Für fold: https://www.youtube.com/watch?v=ucYQyIq6UOM (die Beispiele)
        points.foldLeft(0.0)((a, b) => a + b.distance(Point())) / points.size
    }
    
    //https://alvinalexander.com/scala/fp-book/how-write-functions-take-function-input-parameters/
    //https://stackoverflow.com/questions/19090103/set-default-value-for-function-parameter-in-scala
    //Falls dich Methoden als Methodenparameter interessieren.
    def functionalBubbleSort(values: Array[Int],
                             compare: (Int,Int) => Boolean = _ > _): Array[Int] = {
        if (values.length < 2) return values
        
        for (i <- values.indices;
             j <- 0 until values.length - 1 - i) {
            // Fall j größer ist als j+1 wird getauscht
            if (compare(values(j), values(j + 1))) {
                //Das sieht fancy aus, tauscht aber nur die Zahlen ohne eine extra Variable
                //Add-Swap: https://www.programming-algorithms.net/article/40648/In-place-swap
                values(j) += values(j + 1)
                values(j + 1) = values(j) - values(j + 1)
                values(j) -= values(j + 1)
            }
        }
        values
    }
    
}
