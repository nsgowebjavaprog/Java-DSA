import java.util.ArrayList;

public class DFS {

    // DFS traversal starting from each unvisited node
    public ArrayList<Integer> dfs_search(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V + 1];
        // vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, vis, adj, list);
        return list;
    }

    // Recursive DFS function
    public void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list) {
        vis[node] = true; // mark node as visited
        list.add(node);

        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, list);

            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
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

        // Run DFS
        DFS dfs = new DFS();
        System.out.println("DFS TRAVERSAL:");
        dfs.dfs_search(V, adj);
    }
}