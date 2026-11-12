import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WeightedGraph<T> {
    //f
    private ArrayList<T> vertices;
    private int[][] edges;
    private int numVertices;
    //c
    public WeightedGraph(int capacity) {
        vertices = new ArrayList<>(capacity);
        edges = new int[capacity][capacity];

        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < capacity; j++) {
                edges[i][j] = -1;
            }
        }

        numVertices = 0;
    }
    public void addVertex(T vertex) {
        if (numVertices >= edges.length) {
            throw new IllegalStateException("Graph is full");
        }

        vertices.add(vertex);
        numVertices++;
    }
    private int indexOf(T vertex) {
        for (int i = 0; i < numVertices; i++) {
            if (vertices.get(i).equals(vertex)) {
                return i;
            }
        }
        return -1;
    }
    public void addEdge(T source, T destination, int weight) {
        int sourceIndex = indexOf(source);
        int destinationIndex = indexOf(destination);

        if (sourceIndex == -1 || destinationIndex == -1) {
            throw new IllegalArgumentException("Vertex not found");
        }

        edges[sourceIndex][destinationIndex] = weight;
        edges[destinationIndex][sourceIndex] = weight;
    }
    public boolean hasPath(T startVertex, T endVertex) {
        int startIndex = indexOf(startVertex);
        int endIndex = indexOf(endVertex);

        // Make sure both vertices exist
        if (startIndex == -1 || endIndex == -1) {
            throw new IllegalArgumentException("Vertex not found");
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numVertices];

        queue.add(startIndex);
        visited[startIndex] = true;

        while (!queue.isEmpty()) {
            int current = queue.remove();

            if (current == endIndex) {
                return true;
            }

            for (int i = 0; i < numVertices; i++) {
                if (edges[current][i] != -1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return false;
    }
}
