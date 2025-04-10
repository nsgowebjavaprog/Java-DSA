import java.util.ArrayList;

public class Adj_list {

    // Instead of using a 2D matrix, we use a list of lists

    // Add Edge Method
    static void addEdge(ArrayList<ArrayList<Integer>> list, int source, int destination) {
        list.get(source).add(destination); 
        list.get(destination).add(source);
    }

    // Print Adjacency List
    static void print_adj_list(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print("--->" + list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numVertices = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(numVertices);

        // Initialize the list of lists
        for (int i = 0; i < numVertices; i++) {
            list.add(new ArrayList<Integer>());
        }
        // add edges to the graph
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 0, 3);
        addEdge(list, 1, 2);

        print_adj_list(list);
    }
}