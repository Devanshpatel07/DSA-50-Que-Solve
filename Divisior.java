import java.util.ArrayList;
import java.util.Scanner;

public class Divisior {
    public static ArrayList<Integer> printDivisior(int n){
        ArrayList<Integer> divisior = new ArrayList<>();
        for(int i = 1; i<=n ;i++){
            if(n%i == 0){
                divisior.add(i);
            }
        }
        return divisior;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        ArrayList<Integer> divisior = printDivisior(n);

        for(int div : divisior){
            System.out.print(div+ " ");
        }
    }
}
