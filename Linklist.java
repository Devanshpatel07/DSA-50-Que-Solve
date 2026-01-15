class Linklist {

    public static class Node { // USER DEFINED DATA TYPE
        int val;
        Node next;

        Node(int x) {
            this.val = x;
        }
    }

    public static class LLStack { // USER DEFINED DATA STRUCTURE
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            return size;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.display();
        st.push(2);
        st.display();
        st.push(3);
        st.display();
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(7);
        st.push(4);
        System.out.println(st.isEmpty());
        st.push(100);
        st.display();
    }
}
