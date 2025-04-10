public class Adj_Matrix {

    // A 2D boolean array representing the adjacency matrix.
    private boolean[][] adjMatrix;
    private int numVertices; 

    // Constructor
    public Adj_Matrix(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Method to add an edge between two vertices
    public void addEdge(int i, int j) {
        adjMatrix[i][j] = true; 
        adjMatrix[j][i] = true; // For undirected graph
    }

    // Method to remove an edge between two vertices
    public void removeEdge(int i, int j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    // TO_STRING METHOD

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            sb.append(i + ": ");

            for (boolean j : adjMatrix[i]) {
                sb.append(j ? "1 " : "0 ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Adj_Matrix adj_mat = new Adj_Matrix(4);

        adj_mat.addEdge(0, 1);
        adj_mat.addEdge(0, 2);
        adj_mat.addEdge(1, 2);
        adj_mat.addEdge(2, 0);
        adj_mat.addEdge(2, 3);

        System.out.println(adj_mat.toString());
    }
}

// Output:
// 0: 0 1 1 0
// 1: 1 0 1 0
// 2: 1 1 0 1
// 3: 0 0 1 0

// 1 → Edge exists
// 0 → No edge