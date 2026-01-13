public class ReverseLinkList {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
        }
    }

    public static Node reverse1(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void display(Node head){
        if(head == null){
            return;
        }
            System.out.print(head.data+ " ");
            display(head.next);
        System.out.println();
    }

      public static void displayRev(Node head){
        if(head == null){
            return;
        }
            displayRev(head.next);
            System.out.print(head.data+ " ");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

         display(a);
         a = reverse1(a);
         display(a);
       
    }
}
