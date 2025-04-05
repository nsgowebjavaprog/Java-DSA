import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // Correct return type
    public ArrayList<Integer> bfs_search(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs_res = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0); // start from node 0
        vis[0] = true;

        while (!q.isEmpty()) {
            int curr_node = q.poll(); // get and remove front node
            bfs_res.add(curr_node);

            for (Integer neighbor : adj.get(curr_node)) {
                if (!vis[neighbor]) {
                    q.add(neighbor);
                    vis[neighbor] = true; // mark visited
                }
            }
        }

        return bfs_res;
    }

    public static void main(String[] args) {
        int V = 5; // must be 5 because we're adding adj.get(4)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(4).add(2);

        // Create object and call bfs
        BFS bfs = new BFS();
        ArrayList<Integer> result = bfs.bfs_search(V, adj);

        // Print the result
        System.out.println("BFS TRAVERSAL:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}