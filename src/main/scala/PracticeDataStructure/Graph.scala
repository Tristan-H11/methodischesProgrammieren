package PracticeDataStructure

import scala.collection.mutable

class Graph(val adjacencyMap: mutable.Map[Vertex, mutable.Set[Vertex]] =
            new mutable.HashMap[Vertex, mutable.Set[Vertex]]()) {
    
    def addVertex(newVertex: Vertex): Unit = adjacencyMap.put(newVertex, new mutable.HashSet[Vertex]())
    
    def removeVertex(vertex: Vertex): Unit = adjacencyMap.remove(vertex)
    
    //  def addEdge(fromVertex : Vertex, toVertex : Vertex) : Unit = adjacencyMap.put(fromVertex, toVertex)
    def addEdge(fromVertex: Vertex, toVertex: Vertex): Unit = {
        if (!adjacencyMap.contains(fromVertex)) {
            addVertex(fromVertex)
        }
        adjacencyMap(fromVertex).add(toVertex)
        adjacencyMap.get(fromVertex) // liefert Set der adj. Knoten
        adjacencyMap(fromVertex) // liefert Set der adj. Knoten
    }
    
    def removeEdge(fromVertex: Vertex, toVertex: Vertex): Unit = {
        if (!adjacencyMap.contains(fromVertex) || !adjacencyMap(fromVertex).contains(toVertex))
            throw new NoSuchElementException
        adjacencyMap(fromVertex).remove(toVertex)
    }
    
    
    def isEmpty: Boolean = adjacencyMap.isEmpty
    
//    def dfs(v: Vertex): Set[Vertex] = {
//
//    }
}

case class Vertex(name: String)