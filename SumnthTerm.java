public class SumnthTerm {
    static int term(int n){
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans+i;
        }
        return ans;
    }
    
    public static void main(String args[]){
        int n = 5;
        System.out.println(term(n));
    }
}
