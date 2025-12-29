public class lecture28 {
    static int printFact(int n){
        if(n==0)
        return 1;
//smaller problem
// int smallAns = printFact(n-1);

//self work
    return n*printFact(n-1);

    }
    public static void main(String[] args) {
        System.out.println(printFact(4));
    }
}
