import java.util.Scanner;

public class Lecture34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        System.out.println(s);
        char ch = s.charAt(0);
        System.out.println(ch);

        for(int i=0 ; i<s.length() ; i++){
            System.out.println(s.charAt(i));

            //s.substring(2,4) 2 - in and 4 - out
        }
    }
}
