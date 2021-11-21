package PracticeDataStructure.Mathematical

/**
 * Point-class. Default coordinates set to origin 0|0
 */
case class Point(x: Double = 0, y: Double = 0) {
    
    /**
     * Calculates the distance between this and a given point.
     */
    def distance(p: Point): Double = {
        Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2))
    }
    
    override def toString: String = this match {
        case Point(x, 0) => s"Point on x-axis at $x"
        case Point(0, y) => s"Point on y-axis at $y"
        case Point(x, y) if x == y => s"Point on diagonal at ($x,$y)"
        case _ => s"Point($x,$y)"
    }
}
