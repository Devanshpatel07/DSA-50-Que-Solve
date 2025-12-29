public class lecture29_2 {
    // static int pow(int p , int q){
    //     if(q==0) return 1;
        //recursive work

        // int smallAns = pow(p , q-1);

        // return pow(p , q-1)*p;
        static int pow(int p , int q){
            if(q==0) return 1;
            int smallPow = pow(p , q/2);
            if(q%2==0){
                return smallPow * smallPow;
            }else{
                return p*smallPow*smallPow;
            }
        }

     public static void main(String[] args) {
         int p = 2;
         int q = 5;
        System.out.println(pow(p, q));
     }
}

