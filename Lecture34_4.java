import java.util.Scanner;

public class Lecture34_4 {
    static boolean isPalidrome(String s , int l , int r){
    if(l>= r) return true;

    return (s.charAt(l ) == s.charAt(r) && isPalidrome(s, l+1 , r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalidrome(s, 0, s.length()-1));
    }
}
