package PracticeDataStructure

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
    
}
