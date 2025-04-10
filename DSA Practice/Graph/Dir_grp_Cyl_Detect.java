import java.util.*;

public class Dir_grp_Cyl_Detect {

    public boolean hasCycle(int V, List<List<Integer>> adj) {
        int[] inDegree = new int[V];

        // Step 1: Calculate in-degrees
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u)) {
                inDegree[v]++;
            }
        }

        // Step 2: Add nodes with 0 in-degree to queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: Process queue
        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++; // Count how many nodes are processed

            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Step 4: If not all nodes are processed → cycle exists
        return count != V;
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // Cycle: 1 → 2 → 3 → 1

        Dir_grp_Cyl_Detect obj = new Dir_grp_Cyl_Detect();
        System.out.println("Cycle Present? " + obj.hasCycle(V, adj));
    }
}