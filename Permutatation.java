//nPr = n!/(n-r)!

import java.util.Scanner;

public class Permutatation{
    static long fact(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result = result*i;
        }
        return result;
    }

    static  long npr(int n , int r){
        return  fact(n) / fact(n-r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n =  sc.nextInt();
        System.out.print("Enter the number x");
        int x = sc.nextInt();
        System.out.println(n+"p" + x + "=" + npr(n, x));
        }
}