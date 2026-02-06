public class ChessBoard2 {
    public static boolean checkBoard(int[][] board){
        int base = board[0][0];
        boolean flag = true;
        for(int i=0;i<board.length ; i++){
            for(int j=0 ; j<board[i].length ; j++){
                if((i+j) % 2 == 0 ){
                    if(board[i][j] != base){
                        return false;
                    }
                    else{
                        if(board[i][j] == base){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] board1 = {{0,1}, {1,0}};
        int[][] board2= {{1 ,0,1}, {0,1,0}, {1,0,1}};
        int[][] board3= {{1 ,0,1}, {0,1,0}, {1,1,1}};
        System.out.println(checkBoard(board1) ? "true" : "false");
        System.out.println(checkBoard(board2) ? "true" : "false");
        System.out.println(checkBoard(board3) ? "true" : "false");
    }
}
