package util

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * Works without parentheses
 */
object ExpressionEvaluator {
    def evaluate(expression: String): Double = {
        val stack: mutable.Stack[Double] = new mutable.Stack[Double]()
        val input: ListBuffer[String] = new ListBuffer().addAll(expression.split(' '))
        
        while (input.nonEmpty) {
            if (input.head.matches("[+\\-*\\/]")) {
                val elem1: Double = stack.pop()
                val elem2: Double = stack.pop()
                
                input.remove(0) match {
                    case "+" => stack.push(elem2 + elem1)
                    case "-" => stack.push(elem2 - elem1)
                    case "*" => stack.push(elem2 * elem1)
                    case "/" => stack.push(elem2 / elem1)
                    case _ => throw new IllegalArgumentException
                }
            } else {
                stack.push(input.remove(0).toDouble)
            }
        }
        stack.pop()
    }
}
