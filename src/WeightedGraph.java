import java.util.ArrayList;

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
}
