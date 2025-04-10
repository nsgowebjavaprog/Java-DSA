public class No_Of_Islands {

    public int num_islands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int num_of_land = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    num_of_land++;
                    // call
                    dfs(grid, i, j);
                }
            }
        }
        return num_of_land;
    }

    private static void dfs(char grid[][], int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1')
            return;

        grid[i][j] = '0';

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        No_Of_Islands obj = new No_Of_Islands();

        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };

        System.out.println("Number of Islands: " + obj.num_islands(grid));
    }
}