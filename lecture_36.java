public class lecture_36 {
    static int best(int[] h , int n , int idx){
        if(idx == n-1) return 0;

        int op1 = Math.abs(h[idx] - h[idx+1])+best(h , n ,idx+1);
        if(idx == n-2) return  op1;


        int op2 = Math.abs(h[idx] - h[idx+2])+best(h , n ,idx+2);

        return Math.min(op1 , op2);


    }
    public static void main(String[] args) {
        int[] h = {10,30,20,40};
        System.out.println(best(h, h.length, 0));
    }
}
//Time complexity  = O(2**n)