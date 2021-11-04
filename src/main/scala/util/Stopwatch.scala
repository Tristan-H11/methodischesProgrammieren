package util

case class Stopwatch() {
    private var startTime: Long = _
    private var stopTime: Long = _
    
    /**
     * Starts the stopwatch.
     */
    def start(): Unit = {
        startTime = System.nanoTime()
    }
    
    /**
     * Stops the stopwatch.
     */
    def stop(): Unit = {
        stopTime = System.nanoTime()
    }
    
    /**
     * Returns the elapsed time between start() and stop().
     */
    def elapsedTime(): Long = {
        stopTime - startTime
    }
}
