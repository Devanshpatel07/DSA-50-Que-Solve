public class lecture28_2 {
    static int fibonnaci(int n){
        if(n == 0 || n==1){
            return n;
        }
        //sub problem

        // int pre = fibonnaci(n-1);
        // int prePre = fibonnaci(n-2);
            //self work
        // return pre + prePre;
        return  fibonnaci(n-1) + fibonnaci(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        System.out.println(fibonnaci(i));
    }
}
}