import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // skip spaces
            if (ch == ' ') continue;

            if (ch >= 'a' && ch <= 'z') {
                // lowercase → uppercase
                str.setCharAt(i, (char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                // uppercase → lowercase
                str.setCharAt(i, (char)(ch + 32));
            }
        }

        System.out.println(str);
    }
}
