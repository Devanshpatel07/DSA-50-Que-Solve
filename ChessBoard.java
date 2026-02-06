public class ChessBoard{
    static int Max = 2;
    static boolean  isVaild(int c[][] , int n){
        int X[] = {0,-1,0,1};
        int Y[] = {1 , 0,-1,1};
        boolean isVaild = true;

        //traversing each cell of chess bord
        for(int i =0 ; i<n ;i++){
            for(int j=0 ; j<n ; j++){
                // for each adjact cells
                for(int k=0 ; k<4 ; k++){
                    int newX = i + X[k];
                    int newY = j + Y[k];

                    //different color
                    if(newX < n && newY < n && newX >=0 && newY >= 0 && c[newX][newY] == c[i][j]){
                        isVaild = false;
                    }
                }
            }
        }
        return isVaild;
    }
    public static void main(String[] args) {
        int n =2;
        int[][] c = {{1,0} , {0,1}};

        if(isVaild(c, n)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}