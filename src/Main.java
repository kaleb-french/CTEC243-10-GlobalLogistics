public class Main {
    static void main() {
        WeightedGraph<String> graph = new WeightedGraph<>(6);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B", 10);
        graph.addEdge("B", "C", 10);
        graph.addEdge("C", "D", 10);
        graph.addEdge("D", "E", 10);
        graph.addEdge("A", "E", 50);

        System.out.println("BFS: " + graph.hasPath("A", "E"));
        System.out.println("DFS: " + graph.hasPathDFS("A", "E"));
    }
}
