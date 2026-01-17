import java.util.Stack;

public class Postfix {
     public static void main(String[] args) {
        String infix = "9-5+(3*4)/6";

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // Operand
            if (Character.isDigit(ch)) {
                val.push(ch + "");
            }
            // Opening bracket
            else if (ch == '(') {
                op.push(ch);
            }
            // Closing bracket
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push( v1 + v2 + o);
                }
                op.pop(); // remove '('
            }
            // Operator
            else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    val.push(v1 + v2 + o);
                }
                op.push(ch);
            }
        }

        // Remaining operators
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(o + v1 + v2);
        }

        System.out.println(val.peek());
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
}
