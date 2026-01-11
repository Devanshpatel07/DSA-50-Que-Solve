public class LinkedListMaking {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // LinkedList class
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Insert at end → O(1)
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Insert at head → O(1)
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Insert at index
        void insertAt(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                insertAtHead(val);
                return;
            }

            if (idx == size()) {
                insertAtEnd(val);
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
        }

        // Get value at index
        int getAt(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid index");
                return -1;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete at index
        void deleteAt(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next;
        }

        // Display linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Size of linked list → O(n)
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtEnd(12);
        l1.insertAtHead(1);

        l1.insertAt(4, 7);
        l1.display();   // 1 4 5 12 7

        l1.insertAt(0, 100);
        l1.display();   // 100 1 4 5 12 7

        System.out.println(l1.getAt(3)); // 5

        l1.deleteAt(4);
        l1.display();   // 100 1 4 5 7
    }
}
