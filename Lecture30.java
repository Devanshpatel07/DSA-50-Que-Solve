
    import java.util.*;
public class Lecture30 {

    static void multiples(int n, int k) {
        // Base case
        if (k == 0) {
            return;
        }

        // Recursive call
        multiples(n, k - 1);

        // Print after recursion
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter how many multiples: ");
        int k = sc.nextInt();

        if (k <= 0) {
            System.out.println("k must be greater than 0");
        } else {
            multiples(n, k);
        }

        sc.close();
    }
}

