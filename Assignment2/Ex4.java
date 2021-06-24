import java.util.*;
public static class GraphNode {
  public int data;
  
  GraphNode(int data) {
    
    this.data = data; }
}

class GraphWithAdjacencyList {
    private Map<GraphNode, List<GraphNode>> adjNodes;
    
    void addNode(int key) {
      adjNodes.put(new GraphNode(key), new ArrayList<>());
      }

void removeNode(int key) {
  Stack<GraphNode> removeAll = new Stack<GraphNode>();
  removeAll.addAll(adjNodes.get(new GraphNode (key));
       if (!removeAll.isEmpty()) {
          removeAll.pop();
       }
      adjNodes.remove(new GraphNode (key));
    }

void addEdge(int node1, int node2) {
  adjNodes.get(node1).add(node2);
  adjNodes.get(node2).add(node1);
}

void removeEdge(int node1, int node2) {
  adjNodes.get(node1).clear();
  adjNodes.get(node2).clear();
}

 List<GraphNode> getAdjNodes(int key) {
   return adjNodes.get(new GraphNode (key));
 }
}
