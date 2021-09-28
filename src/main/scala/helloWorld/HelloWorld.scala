package helloWorld

/**
 * HelloWorld Singleton.
 */
object HelloWorld {
    val HELLO_WORLD: String = "Hello World!"

    /**
     * Returns a Hello World Statement.
     * @return "Hello World!"
     */
    def getHelloWorld: String = {
        HELLO_WORLD
    }
}
