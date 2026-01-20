import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterface {
    static void QueueInterfaceExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }

    static void priorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10); //top most elemnt first
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
    public static void main(String[] args) {
        QueueInterfaceExample();
        priorityQueue();
    }
}
