import java.util.Scanner;

public class lecture27_2 {
    static void printList(int n){
        //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        //self

        System.out.println(n);

        //recursive
        printList(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printList(n);
    }
}
