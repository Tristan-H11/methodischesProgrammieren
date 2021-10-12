package recursivePractices

object Practice {
    
    /*
    Sum all numbers to n.
     */
    def sum(n: Int): Int = {
        if (n < 1) return 0
        if (n > 1)
            sum(n - 1) + n
        else
            1
    }
}
