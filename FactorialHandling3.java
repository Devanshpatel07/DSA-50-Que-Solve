//* Node Class
class Node {
    public int data;
    public Node prev;

    public Node(int n) {
        data = n;
        prev = null;
    }
}

class FactorialHandling3 {
    public static void Multiply(Node head, int i) {
        Node temp = head;
        Node prevPtr = head;
        int carry = 0;

        
        while (temp != null) {
            int prod = temp.data * i + carry;
            temp.data = prod % 10; 
            carry = prod / 10;
            prevPtr = temp; 
            temp = temp.prev; 
        }

        
        while (carry != 0) {
            prevPtr.prev = new Node((int) (carry % 10));
            carry /= 10;
            prevPtr = prevPtr.prev;
        }
    }

   
    public static void print(Node head) {
        if (head == null)
            return;
        print(head.prev);
        System.out.print(head.data); 
    }

   
    public static void main(String[] args) {
        int n = 100;
        Node head = new Node(1); 

        for (int i = 2; i <= n; i++)
            Multiply(head, i); 
        System.out.println("Factorial of " + n + " is : ");
        print(head); 
        System.out.println();
    }
}

