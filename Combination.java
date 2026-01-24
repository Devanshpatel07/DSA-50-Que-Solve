import java.util.Scanner;

public class Combination {
    static  long fact(int n){
        long result = 1;
        for(int i = 2 ; i<=n; i++){
            result = result*i;
        }
        return result;
    }
    static long nCr(int n , int r){
        if(r>n) return 0;
        return fact(n)/(fact(r)*fact(n-r));
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =  sc.nextInt();
        System.out.print("Enter the number x:");
        int r = sc.nextInt();
        System.out.println(n+"C" + r + "=" + nCr(n, r));
        }
    }

