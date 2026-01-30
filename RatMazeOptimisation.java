public class RatMazeOptimisation {

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 1}
        };

        printPaths(0, 0, maze.length - 1, maze[0].length - 1, "", maze);
    }

    private static void printPaths(int sr, int sc, int er, int ec,
    String path, int[][] maze) {

        // Boundary check
        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length)
            return;

        // Blocked or already visited
        if (maze[sr][sc] <= 0)
            return;

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        // Mark visited
        maze[sr][sc] = -1;

        // Explore 4 directions
        printPaths(sr, sc + 1, er, ec, path + "R", maze);
        printPaths(sr + 1, sc, er, ec, path + "D", maze);
        printPaths(sr, sc - 1, er, ec, path + "L", maze);
        printPaths(sr - 1, sc, er, ec, path + "U", maze);

        // Backtrack
        maze[sr][sc] = 1;
    }
}
