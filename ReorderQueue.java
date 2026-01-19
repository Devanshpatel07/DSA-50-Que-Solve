import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            q.add(i);
        }

        System.out.println("Original Queue: " + q);

        Stack<Integer> st = new Stack<>();
        int n = q.size();

        // Step 1: Push first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 2: Move stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Push first half again
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 4: Interleave stack and queue
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }

        System.out.println("Reordered Queue: " + q);
    }
}