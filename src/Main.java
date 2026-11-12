public class Main {
    static void main() {
        WeightedGraph<String> graph = new WeightedGraph<>(6);

        graph.addVertex("New York");
        graph.addVertex("Chicago");
        graph.addVertex("Denver");
        graph.addVertex("Los Angeles");
        graph.addVertex("Seattle");
        graph.addVertex("Miami");

        graph.addEdge("New York", "Chicago", 790);
        graph.addEdge("New York", "Miami", 1280);
        graph.addEdge("Chicago", "Denver", 920);
        graph.addEdge("Chicago", "Seattle", 1730);
        graph.addEdge("Denver", "Los Angeles", 830);
        graph.addEdge("Denver", "Seattle", 1300);
        graph.addEdge("Los Angeles", "Seattle", 1135);
        graph.addEdge("Los Angeles", "Miami", 2340);

        System.out.println("BFS - New York to Los Angeles: " + graph.hasPath("New York", "Los Angeles"));

        System.out.println("DFS - New York to Los Angeles: " + graph.hasPathDFS("New York", "Los Angeles"));

        System.out.println("BFS - New York to Miami: " + graph.hasPath("New York", "Miami"));

        System.out.println("DFS - New York to Miami: " + graph.hasPathDFS("New York", "Miami"));
    }
}
