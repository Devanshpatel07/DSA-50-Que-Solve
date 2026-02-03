public class MaxKnight{

    static int maxKnights = 0;

    // Check if it is safe to place a knight at board[row][col]
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        int[][] moves = {
            {-2, +1}, {-2, -1},
            {+2, +1}, {+2, -1},
            {-1, +2}, {-1, -2},
            {+1, +2}, {+1, -2}
        };

        for (int[] move : moves) {
            int i = row + move[0];
            int j = col + move[1];

            if (i >= 0 && i < n && j >= 0 && j < n && board[i][j] == 'k') {
                return false;
            }
        }
        return true;
    }

    // Backtracking function
    public static void solve(char[][] board, int row, int col, int count) {
        int n = board.length;

        // If we reach end of board
        if (row == n) {
            maxKnights = Math.max(maxKnights, count);
            return;
        }

        // Move to next row
        if (col == n) {
            solve(board, row + 1, 0, count);
            return;
        }

        // Try placing knight
        if (isSafe(board, row, col)) {
            board[row][col] = 'k';
            solve(board, row, col + 1, count + 1);
            board[row][col] = 'x'; // backtrack
        }

        // Skip current cell
        solve(board, row, col + 1, count);
    }

    public static void main(String[] args) {
        int n = 3; // board size
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        solve(board, 0, 0, 0);

        System.out.println("Maximum knights that can be placed: " + maxKnights);
    }
}
