public class BasicLinkList{

    public static void insertAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node t  = temp;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }

    public static void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
        System.out.print(head.data+ "  ");
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "  ");
            temp = temp.next;
        }
    }

    public static int length(Node head){
        int count = 0;
        while(head!= null){
            count++;
            head = head.next;
        }
        return  count;
    }


    public static class Node{
        int data; //value 
        Node next; // next

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node d = new Node(5);
        Node c = new Node(6);
        Node b = new Node(7);
        Node e = new Node(8);
        a.next = d;
        d.next = c;
        c.next = b;
        b.next = e;
        System.out.println(length(a));
        insertAtEnd(a, 87);
        display(a);
    }
}