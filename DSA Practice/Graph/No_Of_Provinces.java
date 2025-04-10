public class No_Of_Provinces {

    public int find_circle(int connected[][]) {
        int n = connected.length;
        boolean vis[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                count++;
                dfs(connected, vis, i);
            }
        }
        return count;
    }

    private void dfs(int connected[][], boolean vis[], int i) {
        vis[i] = true;
        for (int neighbor = 0; neighbor < connected.length; neighbor++) {
            if (connected[i][neighbor] == 1 && !vis[neighbor]) {
                dfs(connected, vis, neighbor);
            }
        }
    }

    public static void main(String[] args) {
        No_Of_Provinces obj = new No_Of_Provinces();
        int connected[][] = {
                { 1, 1, 0 },
                { 1, 1, 0 },
                { 0, 0, 1 }
        };

        System.out.println("Number of Provinces: " + obj.find_circle(connected));
    }

}
