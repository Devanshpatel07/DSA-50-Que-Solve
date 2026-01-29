public class ratINDeadMazeFourDirection {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 1}
        };

        boolean[][] isVisited = new boolean[maze.length][maze[0].length];
        print(0, 0, maze.length - 1, maze[0].length - 1, "", maze, isVisited);
    }

    private static void print(int sr, int sc, int er, int ec,
    String path, int[][] maze, boolean[][] isVisited) {

        // Boundary check
        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length)
            return;

        // Blocked or already visited
        if (maze[sr][sc] == 0 || isVisited[sr][sc])
            return;

        // Destination reached
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        // Mark visited
        isVisited[sr][sc] = true;

        // Move in 4 directions
        print(sr, sc + 1, er, ec, path + "R", maze, isVisited);
        print(sr + 1, sc, er, ec, path + "D", maze, isVisited);
        print(sr, sc - 1, er, ec, path + "L", maze, isVisited);
        print(sr - 1, sc, er, ec, path + "U", maze, isVisited);

        // Backtrack
        isVisited[sr][sc] = false;
    }
}

