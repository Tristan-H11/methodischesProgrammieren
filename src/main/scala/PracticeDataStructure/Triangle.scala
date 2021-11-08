package PracticeDataStructure

case class Triangle(points: (Point, Point, Point)) extends Polygon {
    
    val (a, b, c) = lengthOfSides()
    
    /**
     * @inheritdoc
     */
    override def perimeter(): Double = a + b + c
    
    /**
     * @inheritdoc
     */
    override def lengthOfSides(): (Double, Double, Double) = {
        (
            points._1.distance(points._2),
            points._1.distance(points._3),
            points._2.distance(points._3)
        )
    }
    
    /**
     * @inheritdoc
     */
    override def area(): Double = {
        val s = (a + b + c) / 2
        Math.sqrt(
            s * (s - a) * (s - b) * (s - c)
        )
    }
}
