public class nthNodeFrom {

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;

        // calculate size
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // invalid case
        if (n > size || n <= 0) {
            return null;
        }

        int m = size - n + 1; // mth node from start

        // reset temp
        temp = head;

        for (int i = 0; i < m - 1; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // next step to find nth node
    public static  Node nthNode2(Node head , int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return fast
        ;
    } // delete from end
    public static Node deletenthfromEnd(Node head , int  n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        Node f = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

    //     Node q = nthNode2(a, 3);
    //     System.out.println(q.data);
    display(a);
    a = deletenthfromEnd(a,6);
    display(a);
    }
}
