public class knigth {

    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;

        // Base case: reached last number
        if (num == n * n - 1) {
            return true;
        }

        int[] dr = {-2, -2,  2,  2, -1, -1,  1,  1};
        int[] dc = { 1, -1,  1, -1,  2, -2,  2, -2};

        for (int k = 0; k < 8; k++) {
            int i = row + dr[k];
            int j = col + dc[k];

            if (i >= 0 && i < n && j >= 0 && j < n) {
                if (grid[i][j] == num + 1) {
                    return helper(grid, i, j, num + 1);
                }
            }
        }

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0) return false;
        return helper(grid, 0, 0, 0);
    }
}

