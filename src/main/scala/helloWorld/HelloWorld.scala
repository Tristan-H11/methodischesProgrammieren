package helloWorld

/**
 * HelloWorld Singleton.
 */
object HelloWorld {
    val HELLO_WORLD: String = "Hello World!"

    /**
     * Returns a Hello World Statement.
     */
    def getHelloWorld: String = {
        HELLO_WORLD
    }
}
